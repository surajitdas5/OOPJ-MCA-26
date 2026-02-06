class DefaultValues{
    // final int a; // instance 
    final int[] a = new int[5];
    public static void main(String[] args){
        // int a; // local
        String s = new String();
        DefaultValues ob = new DefaultValues();

        System.out.println(ob.a);
        // System.out.println(a);
    }
}