class Human{
    void getInfo(){
        System.out.println("Info of Human");
    }
}

class Student extends Human{
    void getInfo(){
        System.out.println("Info of Student");
    }
}
class OverridingEx2{
    public static void main(String[] args){
        Human h = new Human();
        h.getInfo();
        Human s = new Student();
        s.getInfo();
    }
}