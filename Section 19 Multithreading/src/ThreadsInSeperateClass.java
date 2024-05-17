class MyThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 3: ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread class 2
class MyThread4 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 4: ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadsInSeperateClass {
    public static void main(String[] args) {
        MyThread3 thread1 = new MyThread3();
        MyThread4 thread2 = new MyThread4();

        thread1.start();
        thread2.start();
    }
}