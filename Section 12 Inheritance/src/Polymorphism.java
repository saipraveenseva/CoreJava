
class methodOverloading{
    public int maxInteger(int a, int b){
        return Math.max(a, b);
    }

    public int maxInteger(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }
}


public class Polymorphism {

    public static void main(String[] args) {
        methodOverloading overload = new methodOverloading();
        overload.maxInteger(10,5);
        overload.maxInteger(10,5,20);
        // THis is method overloading. method name could be same but the parameters are different.
        // What method to be called is decided by the number of parameters.

        // Method overloading is also called as compile time polymorphism
        // Method overriding is also called as run time polymorphism

        // Method overloading is achieved in single class or across the classes by inheritance.
        // Method overriding can be achieved only by inheritance and which object are you calling with what reference.

    }
}
