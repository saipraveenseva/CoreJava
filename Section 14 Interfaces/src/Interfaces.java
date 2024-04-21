/*
A purpose of an abstract class is to achieve polymorphism.
Instead of writing an abstract class, we write Interfaces

Writing interfaces instead of abstract classes often comes down to flexibility and design choices. Here are some reasons why interfaces are preferred in certain situations:

Multiple inheritance: In languages like Java, a class can implement multiple interfaces but can only extend one class. This allows for more flexibility in designing class hierarchies. Abstract classes, on the other hand, support single inheritance.
Loose coupling: Interfaces promote loose coupling between components. When a class implements an interface, it's only required to implement the methods specified by that interface. This allows for easier substitution of implementations and better adherence to the Dependency Inversion Principle.
Contract-based programming: Interfaces define contracts that classes agree to fulfill. This makes it easier to reason about the behavior of classes and promotes a clear separation of concerns.
Testing and mocking: Interfaces facilitate easier unit testing and mocking. You can create mock implementations of interfaces to test other classes without relying on concrete implementations.
Versioning and evolution: Interfaces provide a stable contract for clients, allowing implementations to change without affecting the clients as long as the contract remains the same. This makes it easier to evolve systems over time.
However, abstract classes still have their place, especially when:

You want to provide some default implementations.
You need to share code among related classes.
You want to enforce certain methods to be implemented while still providing some common functionality.
In practice, the choice between interfaces and abstract classes often depends on the specific requirements of the design and the trade-offs involved.

 An abstract class with all abstract methods can be written as an interface.

Do's and Don't of an interface
-By default the members of an interface are public. No need to mention public
-The members can only be public.
-public abstract void meth1(); is also legal.
-We can have identifiers inside an interface. These are basically static and final
-int X=10; X cannot be changed.
-The members of an interface are static because we don't create an object to access its members we only use references.
-An interface and extend(inherit) from another interface.
-imp1 is an interface, imp2 extends imp1 and class Test implements imp2 then class Test should override all the methods of imp1 and imp2
-From java 8 default methods are allowed in the interfaces.
-default and static methods need not be overriden in the subclass.
-Interfaces can have its own member functions, they can access by the subclass objects.
** While implementing a project we write some intitial members in an interface and the classes will implement those interfaces
-If we made any further changes in the interface when the classes already implemented the existing interface then the class will become concrete
-This is not a good practice but you still wish to make some changes to the interface in the later stages of the project, we write default classeswe write default classes
-From java 9 we can write private methods in the interface that are not abstract.
-Private methods in interfaces should have a body
 */

interface Test{
    void meth1(); // Members of an interface are by default public. No need to mention public.
    void meth2();   // No other access modifier is allowed for the members of an interface.
    int length=10;

    public static void meth(){ // This will throw an error if we don't use static because Interface abstract methods cannot have body
        System.out.println("Meth");
    }



    default void defaultMeth(){ // This will throw an error if we don't use static because Interface abstract methods cannot have body
        System.out.println("Default Meth");
    }

    private void privatemeth(){
        System.out.println("private method"); // This cannot be access outside of main, so whats the purpose of it?
    }                                           // They can be used internally inside of the interface

    default void internalmethod(){
        privatemeth();      // Her we internally used the private method.
    }
}

class Test2 implements Test{  // Interfaces are implemented and not extended.

    public void meth1(){
        System.out.println("Meth 1");
    }
    public void meth2(){
        System.out.println("Meth 2");
    }
    public void meth3(){
        System.out.println("Meth 3");
    }

}


public class Interfaces {
    public static void main(String[] args) {


        //Test t = new Test(); Similar to abstract classes we cannot create objects for interfaces
        Test t;  // We can create reference to interfaces
        t=new Test2(); // Just like an abstract class, an interface reference can hold the object of subclass.

        System.out.println(t.length);
        //t.length=11; // Not valid since the members of an interface are final.

        t.meth1();
        t.meth2();

        //t.meth3(); // Just like abstract classes, this throws an error becoz t is of type Test and can only access the methods of Test that are overridden in subclass.
        // Just like abstract class we can acheive Dynamic method dispatch(run time polymorphism) by calling the right overridded method during run time

        //t.meth() // This throws an error becoz meth() is not overridden in Test2() subclass.
        Test.meth(); // We can access meth like this. Interface name and member function.


        t.defaultMeth();
        //t.privatemeth(); // This cannot be accessed here since its private

    }
}
