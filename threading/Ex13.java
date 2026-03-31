class BankAccount {
    private int balance = 0;

    synchronized void deposit(int amount){
        System.out.println("Parent is trying to deposit");
        if(amount > 0){
            balance += amount;
            System.out.println("Parent is deposited"+amount+". Current Balance "+balance);
            // notify();
            notifyAll();
        } else {
            System.out.println("Invalid Amount");
        }
    }

    synchronized void withdraw(int amount){
        while(true){
            System.out.println(Thread.currentThread().getName()+" is trying to witdraw");
            if(amount <= balance){
                balance -= amount;
                System.out.println(Thread.currentThread().getName()+" has make witdraw. Current balance "+balance);
                break;
            } else {
                System.out.println("Insufficient Balance");
                try{ 
                    wait();
                } catch(InterruptedException ie){

                }
            }
        }
    }
}

class Parent extends Thread {
    BankAccount account;
    Parent(BankAccount account){
        this.account = account;
    }
    public void run(){
        for(int i=1; i<=10; i++){
            account.deposit(25000);
            try{ Thread.sleep(500); }
            catch(InterruptedException ie){}
        }
    }
}

class Child extends Thread {
    BankAccount account;
    Child(BankAccount account){
        this.account = account;
    }
    public void run(){
        account.withdraw(50000);
    }
}

class Ex13 {
    public static void main(String[] args){
        BankAccount jointAccount = new BankAccount();

        Parent p = new Parent(jointAccount);
        Child c1 = new Child(jointAccount);
        Child c2 = new Child(jointAccount);
        Child c3 = new Child(jointAccount);
        Child c4 = new Child(jointAccount);

        c1.setName("Child-1");
        c2.setName("Child-2");
        c3.setName("Child-3");
        c4.setName("Child-4");

        p.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}