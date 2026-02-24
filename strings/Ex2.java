class Ex2{
    public static void main(String[] args){
        String s1 = "Madam";
        // System.out.println(s1.length());
        // System.out.println(s1.charAt(3));

        String rev = "";
        for(int i=s1.length()-1; i>=0; i--){
            rev += s1.charAt(i);
        }
        System.out.println(rev);

        // if(s1.equals(rev)){
        if(s1.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}