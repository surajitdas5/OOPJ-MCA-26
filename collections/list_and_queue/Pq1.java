import java.util.*;
class Pq1{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(1);
        pq.add(2);
        pq.add(20);
        pq.add(5);


        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}