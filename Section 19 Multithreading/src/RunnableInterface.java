/*
Diff between extending Thread and implementing Runnable.

Difference:

When you extend Thread, your class is a thread, and you define the thread's behavior directly by overriding the run() method. When you implement Runnable, your class isn't a thread but provides the code to be executed by a thread.
Implementing Runnable is more flexible since it allows your class to inherit from other classes and implement multiple interfaces, which is not possible with extending Thread because java does not support multiple inheritance.
Using Runnable is generally considered a better practice in Java for thread creation because it separates the concerns of the thread's behavior from the thread itself.
 */

class My implements Runnable{ // If a class is implementing an interface it should override all the methods of that interface.
                                // Runnable interface has only one method run(). if we dont run it then this class becomes abstract.
   public void run(){
       int i=1;
       while(true){
           System.out.println(i+"Hello");
           i++;
       }
   }
}
public class RunnableInterface { // Both can be written in a same main class and all the steps are absolutely same
    public static void main(String[] args) {
        My m = new My(); // creating an object from My class
        Thread t = new Thread(m); // Creating an object for thread class and passing the object for the My class. This is important even if we using Runnable interface.
        t.start(); // This starts a seperate thread and execute run method. Another thread handles the rest of the main method.

        int i=1;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
}
