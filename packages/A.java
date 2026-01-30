class A{
    public String pubVar = "Public";
    protected String proVar = "Protected";
    String defVar = "Default";
    private String priVar = "Private";

    void displayA(){
        System.out.println("-->Inside A");
        System.out.println(pubVar);
        System.out.println(proVar);
        System.out.println(defVar);
        System.out.println(priVar);
    }
}