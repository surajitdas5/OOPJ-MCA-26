import java.util.*;

class HM1{
    public static void main(String[] args){
        HashMap<String, Integer> fruits = new HashMap<>();

        fruits.put("Mango", 180);
        fruits.put("Apple", 200);
        fruits.put("Banana", 50);
        fruits.put("Grape", 100);
        fruits.put("Banana", 500);

        // System.out.println(fruits);

        // Set<String> fName = fruits.keySet();
        // System.out.println(fName);

        // for(String fn : fName){
        //     System.out.println(fn+" "+fruits.get(fn));
        // }

        for(String fn : fruits.keySet()){
            System.out.println(fn+" "+fruits.get(fn));
        }

        // fruits.forEach((k, v) -> {
        //     System.out.println(k+" : "+v);
        // });

    }
}