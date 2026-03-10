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

class Ex6{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(3);
        nums.add(2);
        nums.add(30);
        nums.add(10);
        nums.add(50);

        // remove operation
        // remove(index)
        // nums.remove(2);

        // remove(object)
        // nums.remove(num); // error: 50n will be treated as index
        // Integer num = 50;
        // nums.remove(num);

        // remove numbers < 10
        // for(int i=0; i<nums.size(); i++){
        //     int x = nums.get(i);
        //     if(x < 10){
        //         nums.remove(i);
        //     }
        // }

        // for(int i=0; i<nums.size(); i++){
        //     Integer x = nums.get(i);
        //     if(x < 10){
        //         nums.remove(x);
        //     }
        // }

        // for(Integer n: nums){
        //     if(n<10){
        //         nums.remove(n);
        //     }
        // }

        // remove using Iterator
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            int n = it.next();
            if(n <10){
                it.remove();
            }
        }

        for(int n : nums){
            System.out.println(n);
        }

    }
}