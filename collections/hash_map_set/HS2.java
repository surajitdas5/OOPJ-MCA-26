import java.util.*;

class HS2{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        int[] arr = { 1, 2, 1, 4, 2, 3, 4};

        for(int n: arr){
            set.add(n);
        }

        // System.out.println(set);
        for(int n : set){
            System.out.println(n);
        }
    }
}