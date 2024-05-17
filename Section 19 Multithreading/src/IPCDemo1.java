class Data{
    int value;
    synchronized public void set(int x) { // Even after placing synchronized keyword we are getting the same result why?
    value=x;    // Because synchronized is declared on a method level that means producer and consumer both cannot access the set method at the same time.
                // But the consumer never user set method it only uses get method so there comes the confilct
    }           // same with the get method. // The solution is in IPC Demo2.java

    synchronized public int get(){
        int x=0;
        x=value;
        return x;
    }

}

class Producer extends Thread{
    Data d;

    Producer(Data d){
        this.d=d;
    }
    public void run(){
        int count=1;
        while(true){
            d.set(count);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); } // delays the thread so the other thread could try to enter

            System.out.println("producer: "+count); // Without the synchronized keyword This producer repeatedly sets the values 1 2 3 4 5 irrespective of consumer consuming
            count++;
        }
    }
}

class Consumer extends Thread{
    Data d;
    Consumer(Data d){
     this.d=d;
    }
    public void run(){
        int value;
        while(true){
            value=d.get();
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); } // delays the thread so the other thread could try to enter

            System.out.println("consumer: "+value); // Without the synchronized keyword This consumer repeatedly consumes irrespective of producers producing.
        }
    }
}

public class IPCDemo1 {

    public static void main(String[] args) {
        Data data = new Data();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();  // Even after using synchronized, the outputs could be Producer 1 consumer 1, producer 2 producer 3, consumer 2, producer 4 etc..

    }
    }
