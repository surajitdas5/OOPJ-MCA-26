import java.util.*;

class Student{
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa){
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display(){
        System.out.println(roll+" "+name+" "+cgpa);
    }
}

class Ex4{
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "john", 9));
        students.add(new Student(2, "jane", 9.2));
        students.add(new Student(3, "albert", 8.9));
        students.add(new Student(4, "clark", 7.9));
        students.add(new Student(5, "smith", 9.2));

        for(Student s : students){
            s.display();
        }
    }
}