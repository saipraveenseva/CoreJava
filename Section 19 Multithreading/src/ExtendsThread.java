class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
        // The Thread class in Java has several constructors, including one that allows you to set the name of the thread:
        //When you create a constructor in your MyThread2 class that takes a String argument and call super(name), you are invoking this specific constructor of the Thread class. This sets the name of your MyThread2 thread to the provided name.
        //setPriority(Thread.NORM_PRIORITY); // We can set priority here as well
    }

    public void run() {
        performTask();      // Instead of writing the logic in the run method like ImplementsRunnable.java we can also write it in a seperate method performTask() and call it in run method.
    }

     void performTask() {
        int count = 1;
        while (true) {
            System.out.println(count++ +" Threads printed"); // Infinite loop that prints numbers.
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
                break; // Break the loop if the thread is interrupted
            }
        }


    }
}



public class ExtendsThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 m2 = new MyThread2("Thread using Thread class");
        // This is how we can name the thread when we are extending the Thread class.
        System.out.println("ID: "+m2.getId());
        System.out.println("Name: "+m2.getName());
        System.out.println("Priority: "+m2.getPriority());
        System.out.println("State: "+m2.getState());
        System.out.println("isAlive: "+m2.isAlive());

        System.out.println();

        m2.setPriority(Thread.MIN_PRIORITY+2);
        System.out.println("isAlive: "+m2.isAlive());
        System.out.println("Priority: "+m2.getPriority());

        //m2.setDaemon(true);
        m2.start();
        //m2.interrupt(); // interrupts the thread and displays the exception e that we threw in the try block.
                        // It stops printing because we used break after seeing exception in the catch block

        // Since we took infinite loops as an example, t.start() starts the thread and continues to run even though main method has done executing
        // To avoid that we make the thread as Daemon. This will end the thread t once the main got executed.
        // If we run the code as is, it will start printing and stops it once the main is done executing.
        // So inorder to avoid that we are making the thread sleep for a while until the main runs
        // Now it will print some numbers and when the main is done executing the thread also terminates.
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }

        // Main is also considered as a thread.
        // If we want stop main thread or any other thread from terminating before other threads complete their execution we use .join() method
        // In our example what if we dont want to terminate the main before the infinite loop complete its execution, then we make the main thread join
        // To use join on main thread we must get a reference to it.

        Thread mainThread = Thread.currentThread(); // Gets the reference of main thread. since its the current thread we use .currentThread()
        //mainThread.join(); // We made the main method to keep running until the infinite loop completes its execution
        // So this will run the infinite loop.


        // Lets say the main thread also has an infinite loop. Daemon and join should be commented out to understand this.
        int count=1;
        while(true){
            System.out.println(count++ +" Mains printed"); // Infinite loop that prints numbers.
            Thread.yield(); // This makes the main thread yield for some time and allow myThread2 to execute.
            // The yielding time is barely milliseconds so we couldn't tell the difference if the main method is yielded or not by looking at the output.
            try {
                Thread.sleep(1000); // The Thread.sleep() method in Java throws an InterruptedException, which is a checked exception. This means that it must be either caught or declared in the method signature using the throws keyword. The InterruptedException is thrown to indicate that a thread that is sleeping, waiting, or otherwise occupied has been interrupted.
            }
            catch(InterruptedException e){
                System.out.println("Manually interrupted the thread");
            }
        }
    }
}
