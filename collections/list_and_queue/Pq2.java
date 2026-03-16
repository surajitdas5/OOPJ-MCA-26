import java.util.*;

class IntComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer n1, Integer n2){
        // highest number has the highest priority
        return n2 - n1;
    }
}

class Pq2{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(new IntComparator());
        pq.add(10);
        pq.add(1);
        pq.add(2);
        pq.add(20);
        pq.add(5);

        // System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}