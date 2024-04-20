
abstract class Shape{
abstract double perimeter(); // A shape has some perimeter, but the formula depends upon the entity or the object
abstract double area();
}

class Circle extends Shape{
    double radius = 10;
    double perimeter(){
        return 2*Math.PI*radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    double length=10;
    double breadth=5;
    double perimeter(){
        return 2*(length+breadth);
    }

    double area(){
        return length*breadth;
    }
}

public class AbstractClassExample2 {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

    }
}
