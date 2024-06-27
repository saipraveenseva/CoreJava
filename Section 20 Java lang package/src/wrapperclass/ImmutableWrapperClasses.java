package wrapperclass;

/*
    The immutability of wrapper classes ensures that their values cannot be changed after creation.
    Any modification results in the creation of a new object.
    This is crucial for maintaining consistency and avoiding unintended side effects in programs.
 */

public class ImmutableWrapperClasses {
    public static void main(String[] args) {
        // Create an Integer object
        Integer num1 = Integer.valueOf(10);
        System.out.println("Initial value of num1: " + num1);

        // Attempt to change the value of num1
        // This actually creates a new Integer object rather than modifying the existing one
        num1 = Integer.valueOf(20);
        System.out.println("Value of num1 after modification attempt: " + num1);

        // Check reference equality
        Integer num2 = Integer.valueOf(10);
        System.out.println("num1 == num2: " + (num1 == num2)); // false, because num1 now references a different object

        // Demonstrate immutability by using a method that returns a modified value
        Integer num3 = increment(num2);
        System.out.println("Value of num2: " + num2); // Still 10, original object is unchanged
        System.out.println("Value of num3: " + num3); // 11, new object with incremented value
    }

    public static Integer increment(Integer num) {
        return num + 1; // This creates a new Integer object with the incremented value
    }
}
