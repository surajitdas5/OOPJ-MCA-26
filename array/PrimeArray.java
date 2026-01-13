import java.util.Scanner;
class PrimeArray{
	boolean isPrime(int n){
		for(int i=2; i<n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrimeArray obj = new PrimeArray();
		System.out.print("Number of elements: ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n;  i++){
			nums[i] =sc.nextInt();
		}
		
		for(int i=0; i<n;  i++){
			if(obj.isPrime(nums[i])){
				System.out.println(nums[i]);
			}
		}
	}
}