class Student{
	int roll;
	String name;
	double cgpa;
	Student(){
		
	}
	Student(int roll){
		this.roll = roll;
	}
	
	Student(int roll, String name){
		//this.roll = roll;
		this(roll);
		this.name = name;
	}
	
	Student(int roll, String name, double cgpa){
		//this.roll = roll;
		//this.name = name;
		this(roll, name);
		this.cgpa = cgpa;
	}
	
	void display(){
		System.out.println(roll+" "+name+" "+cgpa);
	}
	
	public static void main(String args[]){
		Student s = new Student();
		Student s1 = new Student(1);
		Student s2 = new Student(2, "raju");
		Student s3 = new Student(3, "riya", 5.6);
		
		s.display();
		s1.display();
		s2.display();
		s3.display();
	}
}