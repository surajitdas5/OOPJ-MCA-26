import java.util.Scanner;
class ArrayOne{
	public static void main(String[] ironman){
		Scanner sc = new Scanner(System.in);
		// life cycle stages
		// declaration
		// dataType[] arrayVar
		// dataType arrayVar[]
		// dataType []arrayVar
		//int[] arr;
		// instantiation -> object creation
		//arr = new int[5]; // fixed size
		// initialization
		//arr[0] = 10;
		
		//int[] brr = new int[10]; // declaration + instantiation
		//int[] crr = {1, 2, 3, 4, 5}; // declaration + instantiation + initialization
		
		//crr[0] = 100;
		
		//int[] arr = new int[10];
		System.out.println("Number of elements you want to enter: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" array elements");
		for(int i=0; i<n; i++){
			/*int temp = sc.nextInt();
			arr[i] = temp;*/
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are: ");
		/*for(int i=0; i<n; i++){
			System.out.print(arr[i]+"\t");
		}*/
		//extended for loop or for-each loop
		// for(dataType varaible : arrayVariable)
		for(int x : arr){
			System.out.print(x+"\t");
		}
		System.out.println("\nBRR\n");
		int[] brr = {10, 40, 20, 50, 70};
		for(int y : brr){
			System.out.print(y+"\t");
		}
		System.out.println("\nSize of BRR: "+brr.length);
		for(int i = 0; i<brr.length; i++){
			System.out.print(brr[i]+"\t");
		}
	}
}