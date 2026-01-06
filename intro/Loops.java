class Loops{
	public static void main(String args[]){
		/*int i = 1;
		while(i<=10){
			System.out.print(i+" ");
			i++;
		}*/
		/*for(int i=1; i<=10; i++){
			System.out.print(i+" ");
		}*/
		
		/*int num = 123;
		int rev = 0;
		while(num != 0){
			int rem = num % 10;
			rev = 10 * rev + rem;
			num = num / 10;
		}
		System.out.println("Reverse is "+ rev);*/
		
		int rows = 5;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= i; j++ ){
				System.out.print("*\t");
			}
			System.out.print("\n");
		}
	}
}