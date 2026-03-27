class Div3Thread extends Thread{
    int start = 0;
    int end = 0;

    Div3Thread(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        for(int i = start; i<= end; i++){
            if(i%3 == 0){
                System.out.println("Div 3: "+i);
            }
        }
    }
}

class Div7Thread extends Thread{
    int start = 0;
    int end = 0;

    Div7Thread(int start, int end){
        this.start = start;
        this.end = end;
    }
    public void run(){
        for(int i = start; i<= end; i++){
            if(i%7 == 0){
                System.out.println("Div 7: "+i);
            }
        }
    }
}

class Ex3{
    public static void main(String[] args){
        int x = 10;
        int y = 30;
        Div3Thread th1 = new Div3Thread(x, y);
        Div7Thread th2 = new Div7Thread(x, y);

        th1.start();
        th2.start();
    }
}