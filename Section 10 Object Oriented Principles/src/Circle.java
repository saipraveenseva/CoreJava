public class Circle {

    public double radius;
    public double area(){

        return 3.14159265*radius*radius;
    }

    public double perimeter()
    {
        return 2*3.14159265*radius;

    }

    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.radius=10;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());

        Circle c2= new Circle();
        c2.radius=20;
        System.out.println(c2.area());
        System.out.println(c2.perimeter());


    }

}
