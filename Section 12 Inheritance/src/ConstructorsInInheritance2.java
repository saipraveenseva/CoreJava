
class Rectangle2{

    int length;
    int breadth;
    Rectangle2(){ // Non param const of Rectangle2
        length=breadth=1;
    }

    Rectangle2(int l, int b){ // Param const of Rectangle2
        length=l;
        breadth=b;
    }
}

class Cuboid1 extends Rectangle2{

    int height;
    Cuboid1(){ // Non param of cuboid
        height=1;
    }

    Cuboid1(int h){ // param of cuboid
        height=h;
    }

    Cuboid1(int l, int b, int h){
        super(l,b); // this super method takes the l and b from param constructor of Rectangle.
        height=h; // And adds height to it.
    }

    public void Volume(){
        System.out.println("Volume: "+length*breadth*height);
    }
}

public class ConstructorsInInheritance2 {
    public static void main(String[] args) {
        Cuboid1 c1 = new Cuboid1();
        c1.Volume(); // Output will be 1*1*1 since it calls non param const of Rectangle and Cuboid

        Cuboid1 c2 = new Cuboid1(2);
        c2.Volume(); // Output will be 1*1*2 since it calls non param const of Rectangle and Param const of the Cuboid

        Cuboid1 c3 = new Cuboid1(2,2,2);
        c3.Volume(); // Output will be 8 since the super method is used and it fetches the length and breadth from the Rectangle
    }

}
