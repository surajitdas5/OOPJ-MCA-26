package pack1;

import javax.swing.JFrame;

public class Ex1 {
	JFrame frame;
	
	Ex1(){
//		frame = new JFrame();
		frame = new JFrame("Frist Swing App");
		frame.setSize(500, 300);// width, height
		frame.setLocation(400, 100); // x , y
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
//		System.out.println("Hello World!!");
		new Ex1();
	}

}
