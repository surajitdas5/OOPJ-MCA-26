class SumCalulator{
    private int sum = 0;
    synchronized public void calcluateSum(){
        for(int i=1; i<=10; i++){
            sum += i;
            System.out.println(Thread.currentThread().getName()+" is adding "+i+" Current Sum = "+sum);
            try{ Thread.sleep(200); }
            catch(InterruptedException ie){}
        }
    }

    synchronized public void getSum(){
        System.out.println(Thread.currentThread().getName()+"  is reading Sum = "+sum);
    }
}

class Writer extends Thread{
    SumCalulator calc; 
    Writer(SumCalulator calc){
        this.calc = calc;
    }
    public void run(){
        calc.calcluateSum();
    }
}

class Reader extends Thread{
    SumCalulator calc; 
    Reader(SumCalulator calc){
        this.calc = calc;
    }
    public void run(){
        calc.getSum();
    }
}

class Ex12RW{
    public static void main(String[] args){
        SumCalulator calc = new SumCalulator();

        Writer w1 = new Writer(calc);
        Writer w2 = new Writer(calc);

        Reader r1 = new Reader(calc);
        Reader r2 = new Reader(calc);

        w1.setName("Writer-1");
        w2.setName("Writer-2");

        r1.setName("Reader-1");
        r2.setName("Reader-2");

        w1.start();
        w2.start();
        r1.start();
        r2.start();
    }
}