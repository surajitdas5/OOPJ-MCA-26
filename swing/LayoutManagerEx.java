package pack1;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.concurrent.Flow;

import javax.swing.*;

public class LayoutManagerEx {
	JFrame frame;
	JPanel panel;
	JButton[] button = new JButton[20];
	public LayoutManagerEx() {
		frame = new JFrame("Layout Manager Ex");
		frame.setSize(500, 300);
		frame.setLocation(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		
//		Flow Layout
		panel.setLayout(new FlowLayout());
//		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
//		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		for(int i=0; i<10; i++) {
			button[i] = new JButton("Button "+(i+1));
//			button[i].setSize(300, 100);
			button[i].setPreferredSize(new Dimension(300, 100));
			panel.add(button[i]);
		}
		
		
//		Box Layout
//		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//		for(int i=0; i<10; i++) {
//			button[i] = new JButton("Button "+(i+1));
//			panel.add(button[i]);
//		}
		
//		Grid Layout
//		panel.setLayout(new GridLayout());
//		panel.setLayout(new GridLayout(2, 5));
//		panel.setLayout(new GridLayout(2, 5, 5, 5));
////		panel.setLayout(new GridLayout(2, 2)); // wrong
//		for(int i=0; i<10; i++) {
//			button[i] = new JButton("Button "+(i+1));
//			panel.add(button[i]);
//		}
		
//		panel.setLayout(new BorderLayout()); 
//		for(int i=0; i<10; i++) {
//			button[i] = new JButton("Button "+(i+1));
////			panel.add(button[i]);
//		}
//		panel.add(button[0], BorderLayout.NORTH);
////		panel.add(button[1], BorderLayout.SOUTH);
////		panel.add(button[2], BorderLayout.EAST);
//		panel.add(button[3], BorderLayout.WEST);
//		panel.add(button[4], BorderLayout.CENTER);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new LayoutManagerEx();

	}

}
