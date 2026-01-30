import pack.D;
class B{
    void displayB(){
        A a = new A();
        System.out.println("-->Inside B");
        System.out.println(a.pubVar);
        System.out.println(a.proVar);
        System.out.println(a.defVar);
        // System.out.println(a.priVar); // Error
    }
}
class C extends A{
    void displayC(){
        System.out.println("-->Inside C");
        System.out.println(pubVar);
        System.out.println(proVar);
        System.out.println(defVar);
        // System.out.println(priVar); // Error
    }
}

class E extends D{
    void displayE(){
        System.out.println("-->Inside E");
        System.out.println(pubVar);
        System.out.println(proVar);
        // System.out.println(defVar); // Error
        // System.out.println(priVar);  // Error
    }
}

class F{
    void displayF(){
        D d = new D();
        System.out.println("-->Inside F");
        System.out.println(d.pubVar);
        // System.out.println(d.proVar); // Error
        // System.out.println(d.defVar); // Error
        // System.out.println(d.priVar); // Error
    }
}

class Driver{
    public static void main(String[] args){
        // A a = new A();
        // a.displayA();

        // B b = new B();
        // b.displayB();

        // C c = new C();
        // c.displayC();

        // E e = new E();
        // e.displayE();

        F f = new F();
        f.displayF();
    }
}