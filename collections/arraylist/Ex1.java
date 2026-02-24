import java.util.*;

class Ex1{
    public static void main(String[] args){
        ArrayList fruits = new ArrayList();

        // int[] arr = new int[5];

        //arr[0] = "Hello";

        //  add fruits
        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Banana");
        fruits.add("Pineapple");
        // fruits.add(1);
        // fruits.add(2.4);
        // fruits.add(true);
        
        // System.out.println("Size: "+fruits.size());
        // for(int i=0; i<fruits.size(); i++){
        //     System.out.println(fruits.get(i));
        // }

        // for-each
        // for(datatype var : arrayVar){}
        // for(Object x : fruits){
        //     System.out.println(x);
        // }
        for(Object x : fruits){
            // String s = x;// error
            // String s = (String)x;
            System.out.println(s);
        }


        // Iterator
        // Iterator it = fruits.iterator();
        // while(it.hasNext()){
        //     Object ob = it.next();
        //     System.out.println(ob);
        // }
        Iterator it = fruits.iterator();
        // while(it.hasNext()){
        //     String ob = (String)it.next();
        //     System.out.println(ob);
        // }
    }
}