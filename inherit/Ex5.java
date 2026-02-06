class Employee{
    private String name;

    Employee(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Manager extends Employee{
    private int teamSize;

    Manager(String name, int teamSize){
        // this.name = name; // error
        super(name);
        this.teamSize = teamSize;
    }

    public void getDetails(){
        System.out.println(this.getName()+" "+this.teamSize);
    }
}

public class Ex5{
    public static void main(String[] args){
        Manager M1 = new Manager("John", 10);
        M1.getDetails();
    }
}