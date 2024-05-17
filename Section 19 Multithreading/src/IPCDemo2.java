class Data1{
    int value;
    boolean flag=true;
    synchronized public void set(int x) {
        while(flag!=true){      // Just by using this simple flag we can acheive ME
            try{ wait(); } catch(Exception e){} // When the flag=true. Producer keeps waiting until it becomes false which means all the shared objects are consumed and its time for producing more.
        }
        value=x;
        flag=false;
        notify();
    }

    synchronized public int get(){
        int x=0;
        while(flag!=false){
            try{ wait(); } catch(Exception e){} // When the flag=false. Consumer keeps waiting until it becomes true which means there is a new shared object created by consumer and its time to consume it.
        }

        x=value;
        flag=true;
        notify();
        return x;
    }

}

class Producer1 extends Thread{
    Data1 d;

    Producer1(Data1 d){
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

class Consumer1 extends Thread{
    Data1 d;
    Consumer1(Data1 d){
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

public class IPCDemo2 {

    public static void main(String[] args) {
        Data1 data = new Data1();
        Producer1 p = new Producer1(data);
        Consumer1 c = new Consumer1(data);

        p.start();
        c.start();      // Output will be Producer 1 consumer 1, producer 2 consumer 2

    }
}
