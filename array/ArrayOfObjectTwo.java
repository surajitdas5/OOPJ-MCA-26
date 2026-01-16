import java.util.Scanner;
class Student{
	int roll;
	String name;
	
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	
	void display(){
		System.out.println(roll+" "+name);
	}
}
class ArrayOfObjectTwo{
	
	public static void main(String[] args){
		//Student s = new Student(1, "tom");
		//s.display();
		
		Student[] students = new Student[3];
		
		students[0] = new Student(1, "Tom");
		students[1] = new Student(2, "Jerry");
		students[2] = new Student(3, "Spike");
		
		//students[1].display();
		for(Student s : students){
			s.display();
		}
	}
}