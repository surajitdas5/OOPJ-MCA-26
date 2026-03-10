import java.util.*;
class Ex2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Enter a string: ");
        String s1 = sc.next();
        String s2 = "";

        for(int i=0; i<s1.length(); i++){
            stack.push(s1.charAt(i));
        }

        while(!stack.empty()){
            s2+= stack.pop();
        }

        System.out.println(s2);

        if(s1.equals(s2)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}