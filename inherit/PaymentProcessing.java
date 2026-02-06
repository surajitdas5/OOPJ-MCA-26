abstract class Payment{
    Payment(){
        System.out.println("Payment Begin");
    }

    abstract void validate();
    abstract void pay();

    void reciept(){
        System.out.println("Receipt Generated");
    }

    void processPayment(){
        validate();
        pay();
        reciept();
    }
}

class DebitCardPayment extends Payment{
    @Override
    void validate(){
        System.out.println("Debit card is validated");
    }
    @Override
    void pay(){
        System.out.println("Payment done via Debit Card");
    }
}

class CreditCardPayment extends Payment{
    @Override
    void validate(){
        System.out.println("Credit card is validated");
    }
    @Override
    void pay(){
        System.out.println("Payment done via Credit Card");
    }
}
class PaymentProcessing{
    public static void main(String[] arhs){
        Payment p = new DebitCardPayment();
        p.processPayment();

        p = new CreditCardPayment();
        p.processPayment();
    }
}