class MethodsTwo{
	// data member
	int num1, num2;
	
	// constructor
	MethodsTwo(int a, int b){
		num1 = a;
		num2 = b;
	}
	
	// member function
	void setData(int n, int m){
		num1 = n;
		num2 = m;
	}
	
	void display(){
		System.out.println("Num 1 is "+num1+" Num 2 is "+num2);
	}
	
	public static void main(String args[]){
		//int a = 10;
		//MethodsTwo m = new MethodsTwo();
		/*m.num1 = 10;
		m.num2 = 20;*/
		//m.setData(100, 200);
		
		MethodsTwo m = new MethodsTwo(50, 60);
		m.display();
	}
}