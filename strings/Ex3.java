class Ex3{
    public static void main(String[] args){
        StringBuffer s1 = new StringBuffer("Hello");
        // System.out.println(s1[2]);
        StringBuffer s2 = s1;

        // s1 += " World";
        s1.append(" World");

        System.out.println(s1);
        System.out.println(s2);
    }
}