class Parent1
{
    Parent1(){
        System.out.println("Non param of Parent1");
    }

    Parent1(int x){
        System.out.println("Param of Parent1: "+x);
    }
}

class Child1 extends Parent1
{
    Child1(){
        System.out.println("Non param of Child1");
    }

    Child1(int y){
        System.out.println("Param of Child1: "+y);
    }

    Child1(int x, int y){
        super(x); // this super should be first line of the constructor and should have a parameter.
        System.out.println("2 params of child: "+y);
    }
}
public class ParamCOnstructorsInInheritance {
    public static void main(String[] args) {
//        Child1 c1 = new Child1(); // Calls non param const in parent and child
//        Child1 c2 = new Child1(10); // Calls Non param of parent and param of child.
//        // So how to call param const of parent using child class??
        Child1 c3 = new Child1(90,100);
        // we achieve this by using the super keyword

    }
}
