/*
    Rules of method overriding
   -Both overrided methods should have same signature. paramters should be same.
   -Different count of parameters makes it method overloading and method overriding.
   -method name should be exactly the same
   -return type should be same. if A is super class and B is subclass then both methods can have different return types
   class A{}
   class B extends A{}
   class Super{
    public A display(){ return new A(); }
   }
   class Sub extends Super{
   public B display(){ return new B(); } // this is valid.
   }
   -final and static methods cannot be overriden
   -superclass method can be private, public or protected to be overriden
   -subclass method cannot be private if you want to override superclass method. protected and public is allowed.
 */
class Super{                // In the above line its says 1 inheritor means its being inherited once.
    public void display() // In the above line its says 1 override means its being overridden once.
    {
        System.out.println("Superclass display");
    }
}

class Sub extends Super{
    public void display() // Here we have 2 display methods, one is super class and one in sub class.
    {                     // When the sub class inherits the super class, it also inherits its display methodd.
        System.out.println("Subclass display"); // Since the subclass has its own display method, the display method of super class is shadowed.
    }                                           // Only the sub class display is considered.
}                           // This is method overriding. Having same method name but which one is used depends on the object and inheritance.


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub sub = new Sub();
        sub.display();

        // What if I wanted to access subclass display method with the superclass reference?
        // This can be acheived by using superclass reference and subclass object.

        System.out.println("---------------------");
        Super supref = new Sub(); // supref pointing to subclass object.

        supref.display(); // This is called DMD. It requires superclass reference pointing to subclass object and calling a overriding function in both super and subclass.
    }
}
