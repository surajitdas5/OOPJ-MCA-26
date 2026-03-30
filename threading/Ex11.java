class Printer {
    // Synchronized Method
    static synchronized void print(int nop){
        for(int i=1; i<=nop; i++){
            System.out.println(Thread.currentThread().getName()+" is printing page "+i);
            try{ Thread.sleep(200); }
            catch(InterruptedException ie){}
        }
    }
}

class PrintJob extends Thread {
    // Printer printer;
    int nop; // no of pages

    // PrintJob(Printer p, int nop){
    PrintJob( int nop){
        // this.printer = p;
        this.nop = nop;
    }

    public void run(){
        // printer.print(nop);
        Printer.print(nop);
    }
}

class Ex11{
    public static void main(String[] args){
        Printer p1 = new Printer();
        Printer p2 = new Printer();

        // PrintJob t1 = new PrintJob(p1, 10);
        // PrintJob t2 = new PrintJob(p2, 7);
        PrintJob t1 = new PrintJob(10);
        PrintJob t2 = new PrintJob(7);
        
        t1.setName("CT-1");
        t2.setName("CT-2");
    
        t1.start();
        t2.start();
    }
}