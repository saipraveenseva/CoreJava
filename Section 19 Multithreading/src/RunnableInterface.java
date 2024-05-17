/*
Diff between extending Thread and implementing Runnable.

Difference:

When you extend Thread, your class is a thread, and you define the thread's behavior directly by overriding the run() method. When you implement Runnable, your class isn't a thread but provides the code to be executed by a thread.
Implementing Runnable is more flexible since it allows your class to inherit from other classes and implement multiple interfaces, which is not possible with extending Thread because java does not support multiple inheritance.
Using Runnable is generally considered a better practice in Java for thread creation because it separates the concerns of the thread's behavior from the thread itself.

 In Java, both the `Thread` class and the `Runnable` interface are used to create and manage threads, but they do so in different ways. Here are the key differences between the two:

### 1. **Implementation**

- **Runnable Interface:**
  - To create a thread using the `Runnable` interface, you need to implement the `Runnable` interface and define the `run` method.
  - You then create an instance of `Thread` class, passing the `Runnable` instance to the `Thread` constructor.

  ```java
  public class MyRunnable implements Runnable {
      public void run() {
          // Code to be executed in the new thread
      }
  }

  MyRunnable myRunnable = new MyRunnable();
  Thread thread = new Thread(myRunnable);
  thread.start();
  ```

- **Thread Class:**
  - To create a thread by extending the `Thread` class, you need to create a subclass of `Thread` and override the `run` method.

  ```java
  public class MyThread extends Thread {
      public void run() {
          // Code to be executed in the new thread
      }
  }

  MyThread myThread = new MyThread();
  myThread.start();
  ```

### 2. **Inheritance**

- **Runnable Interface:**
  - When you implement the `Runnable` interface, your class can still extend another class since Java supports single inheritance but multiple interface implementations.

- **Thread Class:**
  - When you extend the `Thread` class, your class cannot extend any other class because Java does not support multiple inheritance.

### 3. **Separation of Concerns**

- **Runnable Interface:**
  - Using `Runnable` separates the task from the thread management. This is considered a better practice as it promotes cleaner design by separating the job to be done (the task) from the mechanics of running the job (the thread).

- **Thread Class:**
  - Extending the `Thread` class combines the task and the thread management into a single class, which might not be as clean or flexible as using `Runnable`.

### 4. **Reusability**

- **Runnable Interface:**
  - The `Runnable` interface is more flexible and reusable. You can pass the same `Runnable` instance to multiple threads if needed.

- **Thread Class:**
  - When you extend `Thread`, the task is tightly coupled with the thread itself, which makes it less reusable.

### 5. **Resource Sharing**

- **Runnable Interface:**
  - Sharing resources between multiple threads is easier with `Runnable` as you can create multiple `Thread` objects with the same `Runnable` instance.

- **Thread Class:**
  - Sharing resources is less straightforward because each `Thread` instance has its own `run` method and cannot be easily shared.

### Conclusion

- Use the `Runnable` interface if you want to separate the task from the thread management, need more flexibility, and want to extend another class.
- Use the `Thread` class if you need a quick and simple way to create a thread without additional flexibility or if you don’t need to extend another class.

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
    public static void main(String[] args) {// We create 2 objects one for My class and other for Thread class
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
