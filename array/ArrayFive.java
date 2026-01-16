import java.util.Scanner;
class ArrayFive{
	int[][] initMatrx(int r, int c){
		Scanner sc = new Scanner(System.in);
		int[][] temp = new int[r][c];
		System.out.println("Enter elements ("+r+","+c+")");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				temp[i][j] = sc.nextInt();
			}
		}
		return temp;
	}
	
	void printMatrix(int[][] temp, int r, int c){
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
					System.out.print(temp[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column of first matrix: ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter row and column of second matrix: ");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		if(r1 != r2 || c1 != c2){
			System.out.println("Matrix addition can not be done");
			System.exit(0);
		}
		/*int[][] arr = new int[r1][c1];
		int[][] brr = new int[r2][c2];*/
		ArrayFive ob = new ArrayFive();
		int[][] arr = ob.initMatrx(r1, c1);
		int[][] brr = ob.initMatrx(r2, c2);
		System.out.println("First Matrix");
		ob.printMatrix(arr, r1, c1);
		System.out.println("\nSecond Matrix");
		ob.printMatrix(brr, r2, c2);
		int[][] crr = new int[r1][c1];
		for(int i=0; i<r1; i++){
			for(int j=0; j<c1; j++){
				crr[i][j] = arr[i][j] + brr[i][j];
			}
		}
		System.out.println("\nSum:");
		ob.printMatrix(crr, r1, c1);
	}
}