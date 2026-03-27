// creating thread from Thread class
class MyThread extends Thread {
    public void run(){
        // System.out.println("Child Thread is running");
        for(int i=0; i<=10; i++){
            System.out.println("Child Thread: "+i);
        }
    }
}


class Ex1{
    public static void main(String[] args){
        MyThread th = new MyThread();
        th.start();
        // th.run(); // Will not give multithreading

        for(int i=100; i<=110; i++){
            System.out.println("Main: "+i);
        }
    }
}