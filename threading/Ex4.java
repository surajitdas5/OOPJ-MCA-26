class MyThread extends Thread {
    MyThread(String name){
        super(name);
    }
    public void run(){
        // Thread.currentThread().setName("New name for child");
        // this.setName("ABCD");
        // System.out.println(Thread.currentThread().getName()+" is running");
        System.out.println(this.getName()+" is running");
        // for(int i=0; i<=10; i++){
        //     System.out.println("Child Thread: "+i);
        // }
    }
}
class Ex4{
    public static void main(String[] args){
        Thread.currentThread().setName("Java Main Thread");
        System.out.println("Name: "+ Thread.currentThread().getName());

        // MyThread th = new MyThread();
        MyThread th = new MyThread("New Name");
        // th.setName("Child Thread 0");
        th.start();
    }
}