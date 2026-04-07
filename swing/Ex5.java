package pack1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex5 implements ActionListener {
	JFrame frame;
	JLabel l1, l2, l3, l4;
	JTextField tf1;
	JTextArea ta1;
	JRadioButton maleRb, femaleRb;
	JComboBox<String> cb1;
	JButton btn1;
	ButtonGroup bg1;
	
	Ex5(){
		frame = new JFrame("User Form");
		frame.setSize(300, 500);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		l1 = new JLabel("Name");
		l1.setBounds(30, 20, 200, 15);
		frame.add(l1);
		tf1 = new JTextField();
		tf1.setBounds(30, 40, 200, 30);
		frame.add(tf1);
		
		l2 = new JLabel("Address");
		l2.setBounds(30, 80, 200, 20);
		ta1 = new JTextArea();
		ta1.setBounds(30, 105, 200, 60);
		frame.add(l2);
		frame.add(ta1);
		
		l3 = new JLabel("Gender");
		l3.setBounds(30, 170, 200, 20);
		maleRb = new JRadioButton("Male");
		maleRb.setBounds(30, 195, 100, 20);
		femaleRb = new JRadioButton("Female");
		femaleRb.setBounds(140, 195, 100, 20);
		bg1 = new ButtonGroup();
		bg1.add(maleRb);
		bg1.add(femaleRb);
		frame.add(l3);
		frame.add(maleRb);
		frame.add(femaleRb);
		
		l4 = new JLabel("Country");
		l4.setBounds(30, 225, 200, 20);
		String[] countries = { "Select", "India", "Others" };
		cb1 = new JComboBox<String>(countries);
		cb1.setBounds(30, 250, 200, 30);
		frame.add(l4);
		frame.add(cb1);
		
		btn1 = new JButton("Submit");
		btn1.setBounds(30, 290, 100, 30);
		btn1.addActionListener(this);
		frame.add(btn1);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btn1) {
			String name = tf1.getText();
			String address = ta1.getText();
			String country = (String)cb1.getSelectedItem();
			String gender = "";
			if(maleRb.isSelected()) {
				gender = "Male";
			} else if(femaleRb.isSelected()) {
				gender = "Female";
			}
			if(name.equals("") || address.equals("") || (cb1.getSelectedIndex() == 0) || (!maleRb.isSelected() && !femaleRb.isSelected())) {
				System.out.println("Enter all the values");
			} else {
				System.out.println(name+" "+gender+" "+address+" "+country);
				tf1.setText("");
				ta1.setText("");
				cb1.setSelectedIndex(0);
				bg1.clearSelection();
			}
			
		}
	}

	public static void main(String[] args) {
		new Ex5();

	}

}
