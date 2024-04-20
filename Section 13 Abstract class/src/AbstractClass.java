/* Diff between Abstract class vs Concrete class(Normal class)
-You cannot create object for contract class
-abstract keyword is used for abstract classes
-reference to an abstract class is allowed.
-A method that does not have a body is called abstract method.
-Any class with atleast one abstract method is called an abstract class.
-A class can be abstract without any abstract methods also.
-A subclass which inherits from the abstract class will also become an abstract class.
-For it to become a concrete class, the subclass has to override all the superclass's abstract methods.
-Then we can create an object from the abstract class.

Abstract methods in Java exist to provide a way to define a method signature without implementing the method body.
This allows subclasses to provide their own implementation.
The logic behind abstract methods is to enforce a contract or interface that must be implemented by subclasses.

Real-life example:
Let's use the example of different types of posts on Facebook: TextPost, ImagePost, and VideoPost.

Post is the superclass, representing the general concept of a post on Facebook.
TextPost, ImagePost, and VideoPost are subclasses, representing specific types of posts.
Each type of post might have different methods and behaviors, but let's focus on the method displayPost() which will show the post content on the Facebook feed.

In this example:

Each type of post has its own displayPost() method implementation, which is specific to that type of post.
For TextPost, it displays the text content of the post.
For ImagePost, it displays the image URL of the post.
For VideoPost, it displays the video URL of the post.
This design ensures that each type of post adheres to a common interface (displayPost() method) while allowing each subclass to implement its own logic for displaying the post content based on its specific type.

Dos and Don't of abstract classes
-You cannot create an object for abstract class.
-If a method does not have a body. Make it abstract so the subclasses will inherit it and implement the logic.
-An abstract class cannot be final. A final class cannot be inherited.
-An abstract class cannot be static. static methods cannot be overriden
-An abstract class cannot have static methods. same reason.
-Any subclass inheriting the abstract class must override the abstract methods of the abstract class.
-We can create a reference for abstract class but cannot create objects.
Test t; legal // creating reference
t=new Test(); not legal // creating object
 */

abstract class Super{
    Super(){
        System.out.println("Super class constructor");
    }

    public void meth1(){
        System.out.println("Meth1 of super");
    }
  abstract public void meth2(); // This would give an error if the method is not abstract
     // The abstract keyword will give an error if the class is not declared as abstract.
     // Such abstract classes and methods are only meant for inheritance.
     // We inherit and use the abstract methods.


}

class Sub extends Super{ // THis throws an error if we did not override abstract methods of super class in the body
     public void meth2(){
         System.out.println("Sub meth2");
     }
}
public class AbstractClass {
    public static void main(String[] args) {
        //Super sup = new Super(); This is not allowed becoz creating an object for abstract class is not allowed.

        Super s = new Sub(); // Super class ref and sub class object.
        s.meth1();
        s.meth2(); // Here the abstract method is not called, the overridded meth2 will be called becoz the object is of sub class.

    }
}
