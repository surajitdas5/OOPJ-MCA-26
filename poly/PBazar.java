class Bank{
    double rateOfInterest = 0.0;
    void getRateOfInterest(){
        System.out.println(rateOfInterest);
    }
}

class SBI extends Bank{
    double rateOfInterest = 2.5;
    void getRateOfInterest(){
        System.out.println(rateOfInterest);
    }
}

class HDFC extends Bank{
    double rateOfInterest = 3;
    void getRateOfInterest(){
        System.out.println(rateOfInterest);
    }
}

class PBazar{
     public static void main(String[] args){
        Bank b;

        b = new SBI();
        b.getRateOfInterest();

        b = new HDFC();
        b.getRateOfInterest();
     }
}