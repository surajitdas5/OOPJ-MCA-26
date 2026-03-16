import java.util.*;

class Task {
    String name;
    int priority;
    
    Task(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    void display(){
        System.out.println(name+" "+priority);
    }
}

class TaskComparator implements Comparator<Task>{

    @Override
    public int compare(Task t1, Task t2){
        // smallest number = highest priority
        // return t1.priority - t2.priority;
        // largest number = highest priority
        return t2.priority - t1.priority;
    }
}

class Pq3{
    public static void main(String args[]){
        PriorityQueue<Task> pq = new PriorityQueue<>(new TaskComparator());

        pq.add(new Task("Task 1", 5));
        pq.add(new Task("Task 2", 3));
        pq.add(new Task("Task 3", 1));
        pq.add(new Task("Task 4", 4));
        pq.add(new Task("Task 5", 2));

        // while(pq.size()>0){
        while(!pq.isEmpty()){
            Task t = pq.poll();
            t.display();
        }
    }
}