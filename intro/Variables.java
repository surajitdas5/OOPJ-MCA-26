class Student{
	// instance variable => belongs to object
	int roll;
	String name;
	//String college;
	static String college = "Silicon";
	static int count = 0;
	
	/*Student(int r, String n){
		// r & n is local varaible
		roll = r; // this.roll = r
		name = n; // this.name = n
	}*/
	/*Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}*/
	
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
		//college = "Silicon"
		count++;
	}
	
	void display(){
		System.out.println(roll+" "+name+" "+college);
		System.out.println("Total number of students: "+count);
	}
	
	public static void main(String args[]){
		Student s1 = new Student(1, "Ram");
		Student s2 = new Student(2, "Riya");
		s1.display(); 
		s2.display(); 
	}
	
}