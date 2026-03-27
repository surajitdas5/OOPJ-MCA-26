class MyThread extends Thread{
    public void run(){
        // try{
        //     Thread.sleep(2000); // 2 sec
        // } catch(InterruptedException ie){
        //     System.out.println(ie);
        // }
        for(int i=1; i<=10; i++){
            System.out.println(this.getName()+" : "+i);
            try{
                Thread.sleep(500); // 0.5 sec
            } catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
}

class Ex6Sleep{
    public static void main(String[] args){
        MyThread t = new MyThread();

        t.start();

        for(int i=100; i<=110; i++){
            System.out.println("Main : "+i);
        }
    }
}