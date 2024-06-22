/*
This is same as MonitorsDemo.java but the difference is
I wrote the logic in a single class and took the name as parameter
Another difference is I declared the display method as synchronized unlike putting the for loop inside the synchronized block in MonitorsDemo.java
*/

class Mydata2{
    synchronized void display(String str){ // Second method is declaring this method as synchronized. Like synchronized void display(String str){}
          // By placing this for loop within the synchronised block, only one thread will be allowed into this CS at a time. This is one method.

        for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " "); // This for loop is the critical section of the code.
            try {
                Thread.sleep(500); // Delay to allow interleaving with the other thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Threads extends Thread{
    Mydata2 d; // creating a reference
    String name;
    Threads(Mydata2 d, String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.display(name);
    }
}


public class MonitorsDemo2 {

    public static void main(String[] args) {
        Mydata2 d = new Mydata2(); // assigning an object
        Threads t1 = new  Threads(d,"Hello World ");
        Threads t2 = new Threads(d,"Welcome sir");

        t1.start();
        t2.start();
    }

}
