// throw: manually throw an exception
class Ex7{
    public static void main(String[] args){
        int age = 11;
        try{
            if(age < 18){
                // throw new Exception("Age is invalid");
                throw new ArithmeticException("Age is invalid");
            } else {
                System.out.println("Age is valid");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}