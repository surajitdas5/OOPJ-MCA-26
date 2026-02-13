// Exception propagation
import java.io.*;
class Ex6{
    // void test() throws ClassNotFoundException, IOException {
    void test() throws Exception {
        // int c = 2/0;
        // Class.forName("test");
        FileReader fr = new FileReader("test.txt");
    }
    public static void main(String[] args) throws IOException{
        Ex6 ob = new Ex6();
        FileReader fr = new FileReader("test.txt");
        // try{
        //     ob.test();
        // } catch(Exception e){
        //     System.out.println(e);
        // }
        System.out.println("Done");
    }
}