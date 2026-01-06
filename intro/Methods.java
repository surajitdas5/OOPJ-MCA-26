class Methods{
	void hello(){
		System.out.println("Hello World");
	}
	
	void sum(int num1, int num2){
		System.out.println("Sum = "+(num1+num2));
	}
	
	int product(int num1, int num2){
		int res = num1*num2;
		return res;
	}
	
	public static void main(String args[]){
		//int a = 0;
		// create object
		Methods m = new Methods();
		//m.hello();
		//m.sum(10, 20);
		int result = m.product(2, 3);
		System.out.println("Product is "+result);
		
	}
}