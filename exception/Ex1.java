// try block: contains the risky code
// catch block: handling mechanism
// finally: resource clearing

import java.util.Scanner;
class Ex1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        int c = 0;
        try{
            c = a/b; // error prone
            System.out.println("Result: "+c);
            return;
        } catch(ArithmeticException ae){
            System.out.println(ae);
            // return;
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("Done");
    }
}