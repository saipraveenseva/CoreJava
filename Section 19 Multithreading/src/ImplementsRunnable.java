/*
Thread class methods

constructors
------------
Thread() basic constructor
Thread(Runnable r) we are passing class which is implementing Runnable interface.
Thread(Runnable r, String name) we can also mention the name of the thread
Thread(ThreadGroup g, String name)
Thread(String name) Just the thread name.


get()/set()
-----------
long getId() gets the thread ID
String getname() gets the name
int getPriority() gets the priority
Thread.state getState()  get the state(new, running, blocked....)
ThreadGroup getThreadGroup()

void setName(String name)
void setPriority(int P)
void setDaemon(boolean b) // A Daemon thread is a background thread with the least priority.(garbage collector)

Enquiry
-------
boolean isAlive()
boolean isDaemon()
boolean isInterrupted() // we can interrupt a thread. we use this to see if the thread is interrupted.


Instance methods
----------------
void interrupt() interrupts the thread
void join() A thread finish its job, it can wait for other threads to complete using this method.
void join(long millis) It can join for some time(milliseconds)
void run() runs the thread
void start() starts the thread

static methods
--------------
int activeCount() gives the active thread count
Thread currentThread() gets the reference of the current thread
void yield() A thread which is currently running can yield and give a chance to other threads.
void dumpStack() gives the stack of an application which method called which method similar to exception handling getStack


 */

class MyThread1 implements Runnable{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ +" Threads printed"); // Infinite loop that prints numbers.
            try {
                Thread.sleep(1000); // The Thread.sleep() method in Java throws an InterruptedException, which is a checked exception. This means that it must be either caught or declared in the method signature using the throws keyword. The InterruptedException is thrown to indicate that a thread that is sleeping, waiting, or otherwise occupied has been interrupted.
            }
            catch(InterruptedException e){
                System.out.println("Manually interrupted the thread");
            }
        }
    } // Overriding run() is a must to make it a concrete class.
}
public class ImplementsRunnable {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 m = new MyThread1(); // Creating an object
        Thread t = new Thread(m,"Thread using Runnable interface"); // passing an object of MyRun() class.
                                                            // This is how we can name the thread when we are implementing Runnable interface
                                        // m.getName() is that m is an instance of MyRun, which implements the Runnable interface.
                                        // The Runnable interface does not have a getName() method. The getName() method is defined in the Thread class, not in Runnable.
                                        // Therefore, to get the name of the thread, you need to call getName() on the Thread instance (t), not on the Runnable instance (m).
        System.out.println("ID: "+t.getId());
        System.out.println("Name: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        System.out.println("State: "+t.getState());
        System.out.println("isAlive: "+t.isAlive());


        System.out.println();

        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("isAlive: "+t.isAlive());
        System.out.println("Priority: "+t.getPriority());

        //t.setDaemon(true);
        t.start();
        //t.interrupt();   // Interrupts the thread and displays the custom exception message that we threw in the try block.
                        // The program gets interrupted for a while, prints the messages and continue to print the rest of the numbers because we did not break the loop in the catch block

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
            Thread.yield(); // This makes the main thread yield for some time and allow myThread1 to execute.
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
