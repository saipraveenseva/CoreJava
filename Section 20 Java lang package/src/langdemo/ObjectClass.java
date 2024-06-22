package langdemo;
import java.lang.*; // This is a default package in Java in every java project

/*
    Object class is parent class of all Java classes.
    Any class we learn or going to learn is directly or indirectly inherited from Object class
    Mother of all class
    clone(), equals(object o), finalize(), hashcode(), notify(), wait() are some of the classes that are inherited from Object class.



 */

class MyObject{
 public String toString(){
     return "My Object";        // Overriding the toString() method from the Object class.
 }

 public int hashCode(){
     return 100; // Overriding the hashCode() method from the Object clas
                    // This will return the hashcode as 100 for every object.
 }

 public boolean equals(Object o){
     return this.hashCode()==o.hashCode(); // Overriding the equals method to compare hashcodes.
 }

 /* Cannot override finals methods in Object class
 public void wait(){
     // Cannot override this method because it is final
 }

 public void notifyAll(){
     // Cannot override this method because it is final
 }

    public void notify(){
        // Cannot override this method because it is final
    }

  */


}

class MyObject2 extends MyObject{

}
public class ObjectClass {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3=o2;

        MyObject o4 = new MyObject(); // I created a class MyObject and an object for it.
        /*
            When I do o4. I can see all the methods of Object class
            Which means I dont need to explicitly Inherit from Object class
            Every class is by default inherited from the Object class.

         */

        MyObject2 o5 = new MyObject2();
        /*
            I get the same results if I did o5. because MyObject2 in extended from MyObject
            and that inturn is inherited from Object class
         */

        MyObject o6 = new MyObject();


        System.out.println(o1.equals(o2)); // Returns false because both are seperate objects
        System.out.println(o2.equals(o3)); // Returns true.
        System.out.println(o1.toString()); // Prints the object as a String
        System.out.println(o1.hashCode()); // Returns a hashcode value for the object. THis method is supported for the benefit of the hash tables such as those provided by java.util.HashMap

        System.out.println(o4); // Printing the contents of the overriden method.
        System.out.println(o4.hashCode()); // Returns 100 as the hashCode value.
        System.out.println(o6.hashCode()); // Returns 100 as well because we have overriden the hashCode() method.
        System.out.println(o4.equals(o6)); // This will return false if we did not override the equals method.
    }
}

