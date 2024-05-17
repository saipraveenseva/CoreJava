/*
Java provides a class called Thread and interface called Runnable.
The actual mechanism of multithreading is present in this Thread class.
 */

class MyThread extends Thread{
     public void run(){ // This overrriden run method is a java method from Thread class. Used while multi threading
        int i=1;
        while(true){        // This infinite loop is written for a reason.
            System.out.println(i+"hello");
            i++;
        }
    }
}

public class MultithreadingDemo {   // Both the classes can be written as a single main class and create an object for it. It works the same.
    public static void main(String[] args) {
        MyThread t = new MyThread(); // creating an object for the above class.
        t.start(); // This initiates a thread. it will execute the run method, while other thread will run rest of the main method.

        int i=1;
        while(true){
            System.out.println(i+"world"); // Both are infinite loops. So sometimes hello will be printed and sometimes world
            i++;
        }
    }
}
