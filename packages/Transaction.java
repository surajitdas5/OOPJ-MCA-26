class Account{
    private int balance = 1000;

    public void deposit(int amount){
        if(amount <=0){
            System.out.println("Deposit can not be done");
        } else {
            this.balance += amount;
        }
    }

    void getBalance(){
        System.out.println(this.balance);
    }
}

class Transaction{
    public static void main(String[] args){
        Account a = new Account();
        //a.balance = -100000;
        // a.deposit(-100);
        a.deposit(100);

        a.getBalance();


    }
}