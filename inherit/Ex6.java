class Parent{
    protected String name = "Parent";

    public void display(){
        System.out.println(this.name);
    }
}

class Child extends Parent{
    protected String name = "Child";

    public void display(){
        System.out.println(this.name);
        super.display();
        // System.out.println(super.name);
    }
}

class Ex6{
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}