import java.util.*;

class Student{
    String name;
    double cgpa;

    Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }

    void display(){
        System.out.println(name+" "+cgpa);
    }
}

// Comparator
class CustomComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        // return (int)(s1.cgpa - s2.cgpa);
        // return Double.compare(s1.cgpa, s2.cgpa);
        return s1.name.compareTo(s2.name);
    }
}

class Ex5{
    public static void main(String[] args){
        // ArrayList<Integer> nums = new ArrayList<>();

        // nums.add(3);
        // nums.add(30);
        // nums.add(10);
        // nums.add(50);
        // nums.add(2);

        // Collections.sort(nums);

        // for(int n : nums){
        //     System.out.println(n);
        // }

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("A", 9.2));
        students.add(new Student("D", 8.2));
        students.add(new Student("E", 6.2));
        students.add(new Student("C", 9.1));
        students.add(new Student("B", 8.8));

        Collections.sort(students, new CustomComparator());

        for(Student s: students){
            s.display();
        }
    }
}