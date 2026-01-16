import java.util.Scanner;
class ArrayOfObject{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size: ");
		int size = sc.nextInt();
		String[] names = new String[size];
		System.out.println("Enter "+size+" names: ");
		for(int i=0; i<size; i++){
			names[i] = sc.next();
		}
		System.out.println("Names are: ");
		for(int i=0; i<size; i++){
			System.out.print(names[i]+"\t");
		}
	}
}