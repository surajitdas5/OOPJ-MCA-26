class MethodOverloading{
	
	void add(int a, int b){
		System.out.println("Add 1: "+(a+b));
	}
	
	void add(int a, int b, int c){
		System.out.println("Add 2: "+(a+b+c));
	}
	
	void add(double a, double b){
		System.out.println("Add 3: "+(a+b));
	}
	
	void add(double a, int b){
		System.out.println("Add 4: "+(a+b));
	}
	
	void add(int a, double b){
		System.out.println("Add 5: "+(a+b));
	}
	
	/*void add(int x, int y){
		System.out.println("Add 6: "+(x+y));
	}*/
	int add(int a, int b){
		//System.out.println("Add 1: "+(a+b));
		return a+b;
	}
	
	public static void main(String args[]){
		MethodOverloading ob = new MethodOverloading();
		ob.add(10, 20);
		ob.add(10, 20, 30);
		ob.add(10.0, 20.0);
		ob.add(10.0, 20);
		ob.add(10, 20.0);
	}
}