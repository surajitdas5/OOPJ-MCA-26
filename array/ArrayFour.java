import java.util.Scanner;
class ArrayFour{
	void test(int[] a){
		//a[0] = 100;
		a = new int[5];
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		ArrayFour ob = new ArrayFour();
		ob.test(arr);
		for(int item : arr){
			System.out.print(item+"\t");
		}
	}
}