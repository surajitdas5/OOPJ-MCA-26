package jdbcex;


import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class SwingAdd implements ActionListener {
	JFrame frame;
	JLabel l1, l2, l3, l4, l5;
	JTextField tf1, tf2, tf3;
	JComboBox<String> cb;
	JButton btn1;
	
	SwingAdd(){
		frame = new JFrame("Add Student");
		frame.setSize(250, 500);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		l1 = new JLabel("Roll");
		l1.setBounds(20, 20, 200, 30);
		frame.add(l1);
		tf1 = new JTextField();
		tf1.setBounds(20, 55, 200, 30);
		frame.add(tf1);
		
		l2 = new JLabel("Name");
		l2.setBounds(20, 95, 200, 30);
		frame.add(l2);
		tf2 = new JTextField();
		tf2.setBounds(20, 130, 200, 30);
		frame.add(tf2);
		
		l3 = new JLabel("CGPA");
		l3.setBounds(20, 170, 200, 30);
		frame.add(l3);
		tf3 = new JTextField();
		tf3.setBounds(20, 205, 200, 30);
		frame.add(tf3);
		
		l4 = new JLabel("Status");
		l4.setBounds(20, 240, 200, 30);
		frame.add(l4);
		String[] status = { "Pass", "Fail" };
		cb = new JComboBox<String>(status);
		cb.setBounds(20, 275, 200, 30);
		frame.add(cb);
		
		btn1 = new JButton("Add");
		btn1.setBounds(20, 315, 100, 30);
		btn1.addActionListener(this);
		frame.add(btn1);
		
		l5 = new JLabel();
		l5.setBounds(20, 350, 200, 30);
		frame.add(l5);
		
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			try {
				int roll = Integer.parseInt(tf1.getText());
				String name = tf2.getText();
				double cgpa = Double.parseDouble(tf3.getText());
				String status = (String) cb.getSelectedItem();
				
				String driver = "org.postgresql.Driver";
				String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
				String username = "25mmca01";
				String password = "25mmca01";
				
				Class.forName(driver);
				Connection con = DriverManager.getConnection(connection_url, username, password);
				String qry = "INSERT INTO student(roll, name, cgpa, status) VALUES("+roll+", '"+name+"', "+cgpa+", '"+status+"')";
				Statement smt = con.createStatement();
				int i = smt.executeUpdate(qry);
				if(i == 1) {
					l5.setText("Data Inserted");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
				l5.setText("Error");
			}
		}
		
	}

	public static void main(String[] args) {
		new SwingAdd();

	}

	

}

