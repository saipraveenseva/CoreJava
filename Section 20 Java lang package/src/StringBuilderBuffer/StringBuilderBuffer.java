package StringBuilderBuffer;

/*
    Strings are immutable. It would create another object if we wish to concatenate a String.

    StringBuffer is mutable. It includes all the methods of String class and some additional methods like
    append(), insert()
    Strings create a character array of size as the input.
    StringBuffer has a default capacity of 16
    If what we are trying to append is bigger than the size 16 it would increase the size explicitly.
    StringBuffer is thread safe. means two or more threads cannot use the same object at a time.
    slower than String

    StringBuilder is almost same as StringBuffer but its faster.
    It is not thread safe. It allows more than one String in methods.

 */
public class StringBuilderBuffer {
    public static void main(String[] args) {
        // String Example (Immutable)
        String str = "Hello";
        System.out.println("Original String: " + str);
        str = str.concat(" World");
        System.out.println("Modified String: " + str);

        // StringBuffer Example (Mutable and Thread-Safe)
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + stringBuffer);
        stringBuffer.append(" World");
        System.out.println("Modified StringBuffer: " + stringBuffer);

        // StringBuilder Example (Mutable but Not Thread-Safe)
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + stringBuilder);
        stringBuilder.append(" World");
        System.out.println("Modified StringBuilder: " + stringBuilder);

        // Performance Comparison
        long startTime, endTime;

        // StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            buffer.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

        // StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");

        // Demonstrating Thread Safety of StringBuffer
        StringBuffer sharedBuffer = new StringBuffer("ThreadSafe");
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sharedBuffer.append(i);
            }
            System.out.println("Thread 1: " + sharedBuffer);
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sharedBuffer.append((char) ('A' + i));
            }
            System.out.println("Thread 2: " + sharedBuffer);
        });

        thread1.start();
        thread2.start();
    }
}
