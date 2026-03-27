//creating thread with Runnable interfae
class MyThread implements Runnable{

    public void run(){
        // System.out.println("Child Thread");
        for(int i=0; i<=10; i++){
            System.out.println("Child Thread: "+i);
        }
    }
}

class Ex2{
    public static void main(String[] args){
        MyThread th = new MyThread();
        Thread t = new Thread(th);
        // Thread t = new Thread();
        t.start();

        for(int i=100; i<=110; i++){
            System.out.println("Main: "+i);
        }
    }
}