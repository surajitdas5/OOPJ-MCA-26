class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            if( i== 5 || i == 7){
                Thread.yield();
            }
            System.out.println(this.getName()+" : "+i);
        }
    }
}

class Ex8Yield{
    public static void main(String[] args){
        MyThread t = new MyThread();

        t.start();

        for(int i=100; i<=120; i++){
            System.out.println("Main : "+i);
        }
    }
}