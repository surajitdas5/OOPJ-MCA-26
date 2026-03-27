class MyThread extends Thread{
    int sum = 0;
    public void run(){
        for(int i=1; i<=10; i++){
            sum = sum + i;
            try{
                Thread.sleep(500); // 0.5 sec
            } catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }

    int getSum(){
        return this.sum;
    }
}

class Ex7Join{
    public static void main(String[] args){
        MyThread t = new MyThread();

        t.start();

        try{
            // t.join(); // waiting
            t.join(1000); // timed waiting
        } catch(InterruptedException ie){
            System.out.println(ie);
        }

        System.out.println("Sum = "+t.getSum());
    }
}