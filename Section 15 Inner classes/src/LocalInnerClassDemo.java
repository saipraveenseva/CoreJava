/*
LocalInnerClasses are those classes that are written inside a method.
we can write an inner class inside a method
Purpose?
Lets say we are implementing a method that has the functionality of inheriting a super class or implmenting an interface
we can write such LocalInnerClasses in such scenarios.

A local inner class can be marked as final.
In Java, a local inner class can be marked as final to prevent changes to its definition or behavior by ensuring that it doesn't access non-final local variables of the enclosing method.
This is because a local inner class has access to local variables and parameters of the enclosing method, but only if they are declared as final or effectively final.
 */

class Outer1{
     void display(){
         class Inner1{
            void innerDisplay(){
                System.out.println("Hello from Local Inner class");
            }
        }

        Inner1 i = new Inner1();
        i.innerDisplay();

        //new Inner1().innerDisplay(); I can write this instead of above 2 statements.
        // No need to create a reference just create an object and call innerDisplay();
    }
}
public class LocalInnerClassDemo {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.display();

    }
}
