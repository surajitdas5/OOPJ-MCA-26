import java.util.*;

class HM2{
    public static void main(String[] args){
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "Java Programming";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                // map.put(ch, map.get(ch)+1);
                int frq = map.get(ch);
                frq += 1;
                map.put(ch, frq);
            } else {
                map.put(ch, 1);
            }
        }

        for(char ch : map.keySet()){
            System.out.println(ch+" -> "+map.get(ch));
        }
    }
}