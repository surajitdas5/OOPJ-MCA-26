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

class McaStudent extends Students{
    // static String branch = "MCA";
    String branch;

    void getMcaStudentData(){
        System.out.println(this.name+" "+this.age+" "+roll+" "+branch);
    }
}


class Ex2{
    public static void main(String[] args){
        McaStudent s1 = new McaStudent();
        s1.name = "Sam"; // Human
        s1.age = 21; // Human
        s1.roll =  123; // Student
        s1.branch = "MCA"; // McaStudent
        s1.getMcaStudentData();
    }
}