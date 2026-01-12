class StaticMethods{
	/*static String name;
	StaticMethods(String name){
		this.name = name;
	}
	static void greet(){
		System.out.println("Hello "+name);
	}*/
	static void greet(){
		System.out.println("Hello");
	}
	public static void main(String args[]){
		greet();
		int c = MathUtil.add(10, 20);
		System.out.println(c);
		/*StaticMethods s1 = new StaticMethods("John");
		StaticMethods s2 = new StaticMethods("Jane");
		s1.greet();
		s2.greet();*/
		
	}
}


class MathUtil{
	static int add(int a, int b){
		return a+b;
	}
}