class Circle
{
     public double radius; // This has to be public since this is inherited by the Cylinder class

    public double area(){ // This method also needs to be public
        return Math.PI*radius*radius;
    }
    public double perimeter(){ // This method also needs to be public
        return 2*Math.PI*radius;
    }
}

class Cylinder extends Circle{ // we are writing a class Cylinder and acquire a property radius from the Circle class.

    public double height;

    public double volume(){
        return area()*height; // Formula is PI*r*r*height. Since we calculated area earlier we are inheriting area as well.
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Cylinder c = new Cylinder();    // We are creating an object for cylinder
        c.radius=7; // assigning radius which it accesses through Circle class
        c.height=10; // assigning height its own member of the class

        System.out.println("Area: "+c.area()); // We are calling area() using cylinder object.
        // Since the Cylinder inherits the Circle class we can access its public methods

        System.out.println("Perimeter: "+c.perimeter()); // Same here
        System.out.println("Volume: "+c.volume()); // Here along with area and radius inherited from the Circle class we include our own height and find the volume

    }
}
