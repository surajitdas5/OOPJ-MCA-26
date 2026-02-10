interface A{
    // void test();
    default void test(){
        System.out.println("A test()");
    }
}

interface B extends A{
    // void test();
    @Override
    default void test(){
        System.out.println("B test()");
    }
}

interface C extends A{
    // void test();
    @Override
    default void test(){
        System.out.println("C test()");
    }
}

class D implements B, C{
    // @Override
    public void test(){
        System.out.println("D test()");
        // A.super.test();
        B.super.test();
        C.super.test();
    }
}

class Interface4{
    public static void main(String[] args){
        D d = new D();
        d.test();
    }}