import java.util.*;

class Ex3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Size of the collection: ");
        int size = sc.nextInt();
        System.out.println("Enter Elements: ");
        for(int i=0; i<size; i++){
            list.add(sc.nextInt());
        }
        // list.add(5);
        // list.add(1);
        // list.add(7);
        // list.add(4);
        // list.add(3);

        // list.add(2, 200);

        // list.remove(3);

        // list.set(4, 100);

        // for(Integer n : list){
        // for(int n : list){
        //     System.out.println(n);
        // }
        // int sum = 0;
        // for(int n : list){
        //     // System.out.println(n);
        //     sum += n;
        // }
        // System.out.println(sum);

        // System.out.println(list.contains(5));
        // System.out.println(list.indexOf(3));

        Collections.sort(list);

        for(int n : list){
            System.out.println(n);
        }
    }
}