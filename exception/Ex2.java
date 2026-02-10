import java.util.Scanner;
class Ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter First Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            int c = 0;
            try{
                c = a/b;
                System.out.println("Result: "+c);

            } catch(ArithmeticException ae){
                // System.out.println(ae);
                // System.out.println("Divisor can not be 0");
                // System.out.println(ae.getMessage());
                ae.printStackTrace();
            }
        }
    }
}