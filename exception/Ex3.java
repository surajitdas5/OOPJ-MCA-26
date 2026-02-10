import java.util.Scanner;
import java.util.InputMismatchException;
class Ex3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter First Number: ");
            // int a = sc.nextInt();
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();
            int c = 0;
            c = a/b; 
            System.out.println("Result: "+c);
        } 
        // catch(Exception e){ // error
        //     System.out.println(e); 
        // }
        catch(ArithmeticException ae){
            System.out.println(ae); 
        } catch(InputMismatchException ie){
            System.out.println(ie); 
        } catch(NumberFormatException ne){
            System.out.println(ne); 
        } 
        catch(Exception e){ // generic exception block
            System.out.println(e); 
        }
        System.out.println("Done");
    }
}