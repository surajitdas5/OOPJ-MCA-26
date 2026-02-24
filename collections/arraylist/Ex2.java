import java.util.*;

class Ex2{
    public static void main(String[] args){
        // Collection<Class> var = new Collection<>();
        ArrayList<String> fruits = new ArrayList<>(); // generics

        //  add fruits
        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Banana");
        fruits.add("Pineapple");
        // fruits.add(1);
        // fruits.add(2.4);
        // fruits.add(true);
        
        // System.out.println("Size: "+fruits.size());
        for(int i=0; i<fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        // for-each
        // for(datatype var : arrayVar){}
        // for(Object x : fruits){
        //     System.out.println(x);
        // }
        // for(String x : fruits){
        //     String s = x;
        //     System.out.println(s);
        // }


        // Iterator
        // Iterator it = fruits.iterator();
        // while(it.hasNext()){
        //     Object ob = it.next();
        //     System.out.println(ob);
        // }
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()){
            String ob = it.next();
            System.out.println(ob);
        }
    }
}