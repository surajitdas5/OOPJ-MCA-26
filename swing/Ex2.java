package pack1;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Ex2 {
	JFrame frame;
	JLabel l1, l2, l3;
	Font f, f1;
	
	Ex2(){
		frame = new JFrame("Second Example");
		frame.setSize(500, 400);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.yellow);
		
		l1 = new JLabel("Silicon University");
		l1.setBounds(20, 30, 300, 40);
		//f = new Font("Arial", Font.BOLD, 30); // font fmly, style, size
		f = new Font("Arial", Font.BOLD | Font.ITALIC, 30);
		l1.setForeground(Color.red);
		l1.setFont(f);
		frame.add(l1);
		
		l2 = new JLabel("Bhubaneswar");
		l2.setBounds(20, 80, 150, 25);
		f1 = new Font("Arial", Font.PLAIN, 20);
		l2.setFont(f1);
		frame.add(l2);
		
		l3 = new JLabel("Odisha");
		l3.setBounds(175, 80, 100, 25);
		l3.setFont(f1);
		frame.add(l3);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex2();
	}

}
