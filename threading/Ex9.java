class Printer {
    // Synchronized Method
    synchronized void print(int nop){
        for(int i=1; i<=nop; i++){
            System.out.println(Thread.currentThread().getName()+" is printing page "+i);
            try{ Thread.sleep(200); }
            catch(InterruptedException ie){}
        }
    }
}

class PrintJob extends Thread {
    Printer printer;
    int nop; // no of pages

    PrintJob(Printer p, int nop){
        this.printer = p;
        this.nop = nop;
    }

    public void run(){
        printer.print(nop);
    }
}

class Ex9{
    public static void main(String[] args){
        Printer p = new Printer();

        PrintJob t1 = new PrintJob(p, 10);
        PrintJob t2 = new PrintJob(p, 7);
        PrintJob t3 = new PrintJob(p, 2);
        PrintJob t4 = new PrintJob(p, 5);

        t1.setName("CT-1");
        t2.setName("CT-2");
        t3.setName("CT-3");
        t4.setName("CT-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}