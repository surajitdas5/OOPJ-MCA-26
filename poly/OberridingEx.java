class Parent{
    // public String display(int a){
//    private void display(int a){ // error
   final void display(int a){ 
        System.out.println("Parent display()");
        // return "";
    }
}

class Child extends Parent{
    // annotation
    @Override
    // public void display(int x){
    // protected void display(int x){
    private void display(int x){
        System.out.println("Child display()");
    }
}
class OberridingEx{
    public static void main(String[] args){
        Child c = new Child();
        // c.display();
        c.display(100);
    }
}