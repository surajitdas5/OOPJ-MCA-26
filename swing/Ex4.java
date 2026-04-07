package pack1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex4 implements ActionListener {
	JFrame frame;
	JLabel l1, l2;
	JTextField tf1;
	JButton btn1;
	
	Ex4(){
		frame = new JFrame("Even Odd Checker");
		frame.setSize(300, 200);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		l1 = new JLabel("Enter a number");
		l1.setBounds(30, 20, 200, 15);
		frame.add(l1);
		
		tf1 = new JTextField();
		tf1.setBounds(30, 40, 200, 30);
		frame.add(tf1);
		
		btn1 = new JButton("Check");
		btn1.setBounds(30, 75, 100, 30);
		btn1.addActionListener(this);
		frame.add(btn1);
		
		l2 = new JLabel();
		l2.setBounds(30, 115, 200, 15);
		
		frame.add(l2);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btn1) {
			String inp = tf1.getText();
//			System.out.println(inp);
			if(!inp.equals("")) {
				try {
					int n = Integer.parseInt(inp);
					if(n%2 == 0) {
						l2.setText(n+" is even");
					} else {
						l2.setText(n+" is odd");
					}
					l2.setForeground(Color.black);
					tf1.setText("");
				} catch(NumberFormatException ne) {
					l2.setText("Please enter a valid number");
					l2.setForeground(Color.red);
				}
			} else {
				l2.setText("Please enter a number");
				l2.setForeground(Color.red);
			}
			
		}
	}

	public static void main(String[] args) {
		new Ex4();

	}

}
