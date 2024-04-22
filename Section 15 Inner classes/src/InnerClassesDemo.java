/*
A class within a class is called Inner class.
If a business logic seems too big for a single class we can just split it in a different class within the same class

Types of Inner classes
-Nested Inner
-Local Inner class
-Anonymous Inner class
-Static Inner class

In java a separate class file will be created for every class.
In case of Inner classes 2 class files are created.
1.Outer.class
2.Outer $Inner.class

 */

class Outer{
    int x=10;
    class Inner{
        int y=20;

        void InnerDisplay(){
            System.out.println(x+" from Inner"); // Inner class can access the members of outer class directly
            System.out.println(y+" from Inner");
        }
    }
    void OuterDisplay(){
        Inner i=new Inner(); // We can create an object of Inner class in the outer class
        i.InnerDisplay();

        System.out.println(i.y+" from Outer"); // Outer class cannot access members of Inner class directly, we have to do it through objects.
    }
}
public class InnerClassesDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.OuterDisplay();
        Outer.Inner oi = new Outer().new Inner(); // If I wish to access the members of an inner class from a totally different class I have to use this syntax
        oi.InnerDisplay();
        // Outer.Inner is the way we can create reference.
        // new Outer().new Inner(); I have to create objects for both.
    }
}
