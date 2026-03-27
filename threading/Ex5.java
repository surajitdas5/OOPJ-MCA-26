// Priority
class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(this.getName()+" : "+i);
        }
    }
}


class Ex5{
    public static void main(String[] args){

        Thread.currentThread().setPriority(7);
        // Thread.currentThread().setPriority(70); // java.lang.IllegalArgumentException

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("CT-1");
        t2.setName("CT-2");
        t3.setName("CT-3");

        t1.setPriority(1);
        t2.setPriority(8);
        t3.setPriority(10);

        System.out.println("Priority of Main: "+Thread.currentThread().getPriority());
        System.out.println("Priority of CT-1: "+t1.getPriority());
        System.out.println("Priority of CT-2: "+t2.getPriority());
        System.out.println("Priority of CT-3: "+t3.getPriority());

        t1.start();
        t2.start();
        t3.start();

        // t1.start();
    }
}