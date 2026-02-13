import java.io.*;
class Ex5{
    public static void main(String[] args){
        int[] a = new int[1];
        a[100] = 100;
        try{
        // int c = 3/0;
        Class.forName("test");
        FileReader fr = new FileReader("test.txt");

        } catch(Exception e){
            System.out.println(e);
        }
    }
}