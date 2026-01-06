class Conditionals{
	public static void main(String args[]){
		int a=10, b=20, c=15;
		if(a>b && a>c){
			System.out.println(a+" is largest");
		} else if(b>c){
			System.out.println(b+" is largest");
		} else {
			System.out.println(c+" is largest");
		}
	}
}