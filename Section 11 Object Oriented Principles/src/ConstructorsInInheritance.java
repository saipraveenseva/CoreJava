
class Parent{
    public Parent(){
        System.out.println("Parent constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child constructor");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("Grand Child constructor");
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {

        GrandChild gc = new GrandChild();
        /* Since we are using inheritance the output will be:
            Parent constructor
            Child constructor
            Grand Child constructor
         */
    }
}
