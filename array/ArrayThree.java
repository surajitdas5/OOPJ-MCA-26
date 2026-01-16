import java.util.Scanner;
class ArrayThree{
	int addElements(int a[]){
		int sum =0;
		for(int item : a){
			sum += item; // sum += nums[i]
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Array Size: ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter "+n+" array elements");
		for(int i=0; i<n; i++){
			nums[i] = sc.nextInt();
		}
		/*System.out.println("Array elements are: ");
		for(int i=0; i<n; i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println("\nArray elements are (for each loop): ");
		for(int item : nums){
			System.out.print(item+"\t");
		}*/
		/*int sum = 0;
		for(int item : nums){
			sum += item; // sum += nums[i]
		}*/
		ArrayThree ob = new ArrayThree();
		int sum = ob.addElements(nums);
		System.out.println("\nSum of array elements is "+sum);
	}
}