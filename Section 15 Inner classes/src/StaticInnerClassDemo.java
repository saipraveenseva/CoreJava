/*
Static Inner classes are the static members of the outer classes
The objects of the static inner classes can be created outside the outer class.
No need to create an object for outer class

In nested inner classes, I saw they are dependent on outer class and they are not accessible directly outside of inner class without an object of outer class
 But object of the static inner class can be created outside the outer class without creating an object of outerclass

Only key difference between nested inner class and static inner class are:
1. Only static members of outer class can be accessed by static inner class
2. If I wish to access inner class members from a different class I used this syntax to create an object.
  Outer3.Inner3 i = new Outer3.Inner3();

 */

class Outer3{
    static int x=10;
    int y=20;

    static class Inner3{
        int p=10;
        void display(){
            System.out.println(x+" from static inner class");
            //System.out.println(y+" from static inner class");  // THis is not allowed becoz it cannot access non-static members of the outer class.
        }
    }


}
public class StaticInnerClassDemo {
    public static void main(String[] args) {
        Outer3.Inner3 i = new Outer3.Inner3(); // This is accessing the static inner class members from a completely different class.
        i.display();
       // unlike nested inner class new write  Outer3.Inner3 i = new Outer3.Inner3();
        System.out.println("p: "+i.p);
    }
}
