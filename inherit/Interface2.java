interface A{
    void test();
}

interface B{
    void fun();
}

class C implements A, B{
    public void  test(){
        System.out.println("C test()");
    }

    public void fun(){
        System.out.println("C fun()");
    }
}

class Interface2{
    public static void main(String args[]){
        C c = new C();
        c.test();
        c.fun();
    }
}