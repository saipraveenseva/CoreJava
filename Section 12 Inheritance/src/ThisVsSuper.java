/* ThisVsSuper
---------------
this is reference to a current object.
this is used for pointing to the current object.
this can be used to avoid name conflicts between parameters and properties.
using this in assigning and printing data is a good practice.

super is reference to a super class

 */



class Rectangle
{
    int length;
    int breadth;
    int x=10;

    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void display(){
        System.out.println("length: "+this.length);
        System.out.println("breadth: "+this.breadth);

    }
}

class Cuboid extends Rectangle{
    int height;
    int x=20;

    Cuboid(int l, int b, int height){
        super(l,b); //  super takes the l,b parameters from Rectangle super class
        this.height=height; // height is its own.
    }

    void display(){
        System.out.println("super x: "+ super.x); // here the super is user to get the x from super class
        System.out.println("x: "+this.x); // this x is its own.
    }
}

public class ThisVsSuper {

    public static void main(String[] args) {
        Rectangle r1= new Rectangle(10,5);
        r1.display();    // length: 10 breadth:5

        Cuboid c1 = new Cuboid(20,10,5);
        c1.display();    // super.x=20 this.x=10
    }
}
