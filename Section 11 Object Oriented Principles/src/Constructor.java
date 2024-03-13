class Rectangle1{
    private int length;
    private int breadth;

    /*
    Constructors are used to assign values to the objects when they are created
    1. Constructor name should be same as Class name
    2. Constructors does not have a return type and does not return anything.
    3. Constructors can be public/private.
    4. Constructors can be overloaded.
     */

    public Rectangle1()   // This is a default constructor. Assign default values of 10 and 5.
    {
        length=10;
        breadth=5;

    }

    public void setBreadth(int b){
        breadth=b;
    }
    public Rectangle1(int l, int b)   // This is a parameterised constructor.
    {                                   // Constructor overloading.
        length=l;   // We can assign values by passing them as parameters.
        setBreadth(b); // We can call setters from constructors as well.
    }

    public double area(){
        return length*breadth;
    }
}

public class Constructor {

    public static void main(String[] args) {
        Rectangle1 r1= new Rectangle1(); // This calls the default constructor so 10 and 5 gets assigned .
        System.out.println(r1.area());

        Rectangle1 r2= new Rectangle1(20,10); // This calls parameterised constructor. we are passing 20 and 10 and those will be assigned.
        System.out.println(r2.area());



    }


}
