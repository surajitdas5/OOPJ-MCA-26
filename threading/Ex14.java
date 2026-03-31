class ShowRoom {
    int noOfCars = 0;

    synchronized void addCar(){
        noOfCars += 1;
        System.out.println("Manufacturer has added one car, No on cars "+noOfCars);
        notifyAll();
    }

    synchronized void buyCar(){
        while(true){
            System.out.println(Thread.currentThread().getName()+"is trying to purcahse a car");
            if(noOfCars > 0){
                noOfCars -= 1;
                System.out.println(Thread.currentThread().getName()+" has purchased one car, No on cars "+noOfCars);
                break;
            } else {
                System.out.println("Insufficient Car");
                try{ 
                    wait();
                } catch(InterruptedException ie){

                }
            }
        }
    }
}

class Manufacturer extends Thread{
    ShowRoom showroom;

    Manufacturer(ShowRoom sr){
        showroom = sr;
    }

    public void run(){
        for(int i=0; i<10; i++){
            showroom.addCar();
            try{ Thread.sleep(500); }
            catch(InterruptedException ie){}
        }
    }
} 


class Customer extends Thread {
    ShowRoom showroom;

    Customer(ShowRoom sr){
        showroom = sr;
    }

    public void run(){
        showroom.buyCar();
    }
}

class Ex14{
    public static void main(String[] args){
        ShowRoom sr = new ShowRoom();

        Manufacturer t1 = new Manufacturer(sr);

        Customer c1 = new Customer(sr);
        Customer c2 = new Customer(sr);
        Customer c3 = new Customer(sr);
        Customer c4 = new Customer(sr);
        Customer c5 = new Customer(sr);

        c1.setName("Customer-1");
        c2.setName("Customer-2");
        c3.setName("Customer-3");
        c4.setName("Customer-4");
        c5.setName("Customer-5");


        t1.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}