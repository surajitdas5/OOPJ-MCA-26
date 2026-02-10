interface A{
    int a = 10; 
}
interface B{
    int b = 20;
}

class C{
    int c = 30;
}

// class D extends C implements A, B{ // order
class D implements A, B extends C{ 
    void display(){
        System.out.println(a+" "+b+" "+c);
    }
}

class Interface3{
    public static void main(String[] args){
        D d = new D();
        d.display();
    }
}