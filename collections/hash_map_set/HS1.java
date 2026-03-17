import java.util.*;

class HS1{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(10);
        set.add(2);

        // System.out.println(set);
        for(int n : set){
            System.out.println(n);
        }
    }
}