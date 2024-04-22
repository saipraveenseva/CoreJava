/*
Anonymous Inner class can be defined at the creation of object itself
Purpose?
If we have to implement an interface that has a limted usage,
we can create a class then and there while creating an object.
 anonymous inner class can extend exactly one class or implement exactly one interface
why?
cuz multiple inheritance is not a thing in java, it keeps the code simple and clear.
 */

abstract class My{ // THis is an abstract class. I can have an interface here instead of an abstract class.
    abstract void anonymousDisplay(); // Providing a rule to other classes to override this method.
}

class Outer2 { // No need to extend My as I used to do it earlier since we have written an anonymous inner class
    void meth(){
        int p=10; //outer class member
        My m = new My() // I cannot create objects for abstract classes but whats this?
        {               // This is an anonymous inner class where the class is written during the object creation.

            void anonymousDisplay(){ // Overriding the method from abstract class.
                System.out.println("Hello from Anonymous Inner class");
                System.out.println(p); // anonymous inner class can access the members of outer class
            }
        }; // semicolon is needed becoz I am defining the class
        m.anonymousDisplay();
    }
}
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Outer2 o2 = new Outer2();
        o2.meth();
    }
}
