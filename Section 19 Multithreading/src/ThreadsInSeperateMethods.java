class ThreadsInSeperateMethods {

    public void thread7Method() {
        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 7: ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread7.start();
    }

    public void thread8Method() {
        Thread thread8 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 8: ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread8.start();
    }

    public static void main(String[] args) {
        ThreadsInSeperateMethods example = new ThreadsInSeperateMethods();
        example.thread7Method();
        example.thread8Method();
    }
}
