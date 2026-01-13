class StaticBlock{
	static int a;
	static{
		System.out.println("Static Block");
		a = 100;
	}
	StaticBlock(){
		System.out.println("Constructor");
	}
	
	void display(){
		System.out.println(a);
	}
	public static void main(String args[]){
		System.out.println("main method");
		StaticBlock ob = new StaticBlock();
		ob.display();
	}
}