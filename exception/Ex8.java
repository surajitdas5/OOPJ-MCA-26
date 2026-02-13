class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class InvalidAmountException 
class Ex8{
    public static void main(String[] args){
        int age = 11;
        try{
            if(age < 18){
                throw new InvalidAgeException("Age is invalid");
            } else {
                System.out.println("Age is valid");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}