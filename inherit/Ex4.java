// order of execution of constructors in inheritance
class Parent{
    // Parent(){
    //     System.out.println("Parent non-param Constructor");
    // }
    // Parent(){}
    Parent(String s){
        System.out.println("Parent param Constructor");
    }
}

class Child extends Parent{
    // Child(){
    //     System.out.println("Child non-param Constructor");
    // }
    Child(String s){
        super(s); // this should be the first line
        // this(); // error
        System.out.println("Child param Constructor");
    }
}


public class Ex4{
    public static void main(String[] args){
        // Child c = new Child();
        Child c = new Child("Hello");
    }
}