// Linked list
import java.util.*;
class Employee{
    String name;
    double salary;
    int age;

    Employee(String name, double salary, int age){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    void display(){
        System.out.println(name+" "+salary+" "+age);
    }
}

class EmpComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        // sort based on age in ascending order
        // return e1.age - e2.age;
        // sort based on age in descending order
        // return e2.age - e1.age;

        // salary
        // return Double.compare(e1.salary, e2.salary);

        // name
        return e1.name.compareTo(e2.name);
    }
} 

class Ex1{
    public static void main(String[] args){
        LinkedList<Employee> emps = new LinkedList<>();

        // add eleements
        emps.add(new Employee("jhon", 150, 50));
        emps.add(new Employee("jane", 100, 60));
        emps.add(new Employee("smith", 250, 80));
        emps.add(new Employee("albert", 175, 40));
        emps.add(new Employee("clark", 130, 70));

        // insert at 3
        emps.add(3, new Employee("simon", 300, 40));

        // sort
        // Collections.sort(emps, new EmpComparator());

        // remove age > 60
        // Iterator<Employee> it = emps.iterator();
        // while(it.hasNext()){
        //     Employee e = it.next();
        //     if(e.age > 60){
        //         it.remove();
        //     }
        // }

        // display
        // for(Employee e : emps){
        //     e.display();
        // }

        int totalAge = 0;
        for(Employee e : emps){
            totalAge += e.age;
        }
        System.out.println("Average Age is "+(totalAge/emps.size()));
        System.out.println("Highest Paid Employee ");

        Employee hpe = emps.get(0);
        for(Employee e : emps){
            if(e.salary > hpe.salary){
                hpe = e;
            }
        }
        hpe.display();
    }
}