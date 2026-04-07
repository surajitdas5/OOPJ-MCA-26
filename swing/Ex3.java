package pack1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.*;

public class Ex3 implements ActionListener {
	JFrame frame;
	JLabel l1, l2, l3;
	JButton btn1, btn2;
	
	Ex3(){
		frame = new JFrame("First Event Example");
		frame.setSize(500, 400);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		l1 = new JLabel("Click any button");
		l1.setBounds(20, 30, 300, 15);
		frame.add(l1);
		
		btn1 = new JButton("Button 1");
		btn1.setBounds(20, 50, 100, 30);
		btn1.addActionListener(this);
		frame.add(btn1);
		
		btn2 = new JButton("Button 2");
		btn2.setBounds(130, 50, 100, 30);
		btn2.addActionListener(this);
		frame.add(btn2);
		
		l2 = new JLabel();
		l2.setBounds(20, 90, 300, 15);
		frame.add(l2);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == btn1) {
			System.out.println("Button 1 is clicked");
			l2.setText("Button 1 is clicked");
//			frame.getContentPane().setBackground(Color.red);
			l2.setForeground(Color.red);
		} else if(ae.getSource() == btn2) {
			System.out.println("Button 2 is clicked");
			l2.setText("Button 2 is clicked");
//			frame.getContentPane().setBackground(Color.blue);
			l2.setForeground(Color.green);
		}
	}
	
	public static void main(String[] args) {
		new Ex3();
	}

}
