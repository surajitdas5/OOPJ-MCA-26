class Human{
    String name;
    int age;

    void display(){
        System.out.println(name+" "+age);
    }
}

class Students extends Human{
    int roll;

    void displayRoll(){
        System.out.println(roll);
    }

    void getStudentData(){
        System.out.println(this.name+" "+this.age+" "+roll);
    }
}


class Ex1{
    public static void main(String[] args){
        // Human h = new Human();
        // h.name = "John";
        // h.age = 20;
        // h.display();

        Students s = new Students();
        s.name = "Jane";
        s.age = 19;
        s.roll = 111;
        // s.display();
        // s.displayRoll();
        s.getStudentData();
    }
}