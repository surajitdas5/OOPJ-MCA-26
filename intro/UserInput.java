// Scanner
import java.util.Scanner;
class UserInput{
	public static void main(String args[]){
		// scanner clas object
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter a integer number: ");
		int a = sc.nextInt();
		System.out.print("Enter a float number: ");
		float b = sc.nextFloat();
		System.out.print("Enter a long number: ");
		long c = sc.nextLong();
		System.out.print("Enter a double number: ");
		double d = sc.nextDouble();
		System.out.println(a+" "+b+" "+c+" "+d);*/
		//System.out.print("Enter a string: ");
		//String s = sc.next();
		//String s = sc.nextLine();
		//System.out.println(s);
		
		// Problem: Scanner class
		/*System.out.print("Enter your roll number: ");
		int roll = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter your CGPA: ");
		float cgpa = sc.nextFloat();*/
		
		System.out.print("Enter your roll number: ");
		int roll = Integer.parseInt(sc.nextLine());
		System.out.print("Enter your Name: ");
		String name = sc.nextLine();
		System.out.print("Enter your CGPA: ");
		float cgpa = Float.parseFloat(sc.nextLine());
		
		System.out.println(roll+" "+name+" "+cgpa);
		
	}
}