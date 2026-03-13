import java.util.*;
class Dq{
    public static void main(String args[]){
        LinkedList<Integer> deque = new LinkedList<>();

        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);
        
        deque.addLast(100);
        deque.addLast(200);

        for(int n : deque){
            System.out.print(n+" ");
        }

        // while(deque.size()>0){
        //     // System.out.print(deque.pollFirst()+" ");
        //     System.out.print(deque.pollLast()+" ");
        // }
    }
}