final class Human{}
class Student extends Human{
    String name;
}
class FinalEx{
    // final variable
    // final int a = 10;
    // Blank final var
    final int a;
    // instance block
    {
        this.a = 50;
    }

    // FinalEx(int a){
    //     // this.a = a;
    // }

    // void setA(int a){
    //     this.a = a;
    // }


    public static void main(String[] args){
        // FinalEx ob = new FinalEx();
        // // FinalEx ob = new FinalEx(200);

        // // ob.setA(100);
        // System.out.println(ob.a);

        final Student s = new Student();

        s.name = "John";
        System.out.println(s.name);

        s.name = "Jane";
        System.out.println(s.name);

        // s = new Student();
    }
}