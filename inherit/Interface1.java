interface A{
    int a = 0;
    int b = 10;
    // A(){} // error
    void test();
    void test1();

    // java 8+
    default void defFunc(){
        System.out.println("A def Func");
        privateFunc();
    }

    static void staticFunc(){
        System.out.println("A staticFunc");
    }
    // java 9+
    private void privateFunc(){
        System.out.println("A privateFunc");
    }
}

class B implements A{
    public void test(){
        System.out.println("B test()");
    }
    public void test1(){
        System.out.println("B test1()");
    }
}

class Interface1{
    public static void main(String[] args){
        B b = new B();
        // b.test();
        // b.test1();
        b.defFunc();
        // A.staticFunc();
    }
}