import java.util.*;
class Ex1{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(10);
        stack.push(2);
        stack.push(5);
        stack.push(25);

        // System.out.println("Is empty: "+stack.empty());
        // System.out.println("POP: "+stack.pop());
        // System.out.println("PEEK: "+stack.peek());
        // System.out.println("is 5 there: "+stack.search(new Integer(5)));

        Collections.sort(stack);

        for(int n: stack){
            System.out.println(n);
        }

    }
}