/*
We are creating a problem to solve.
thread1 job is to print "Hello world"
thread2 job is to print "Welcome"

Output will be a mixture of both the Strings

Now we introduce the Monitors concept and solve this problem.
They both are trying to access a method called display() at the same time.
display() function prints the string letter by letter given by the threads
 */

class Mydata{
    void display(String str){ // Second method is declaring this method as synchronized. Like synchronized void display(String str){}
        synchronized (this) { // By placing this for loop within the synchronised block, only one thread will be allowed into this CS at a time. This is one method.
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " "); // This for loop is the critical section of the code.
            }
        }
    }
}

class Thread1 extends Thread{
    Mydata d1; // creating a reference

    Thread1(Mydata d1){
        this.d1=d1;
    }
    public void run(){
        d1.display("Hello World");
    }
}

class Thread2 extends Thread{
    Mydata d2; // creating a reference

    Thread2(Mydata d2){
        this.d2=d2;
    }
    public void run(){
        d2.display("Welcome");
    }
}

public class MonitorsDemo {

    public static void main(String[] args) {
        Mydata d = new Mydata(); // assigning an object
        Thread1 t1 = new  Thread1(d);
        Thread2 t2 = new Thread2(d);

        t1.start();
        t2.start();
    }

}
