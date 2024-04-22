
//static class StaticTest{ // This throws an error: Outer classes cannot be static, only inner classes can be static
class StaticTest{
    static int x=10;
    int y=20;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }

    static void display(){ // static method can only access static members
        System.out.println(x);
        //System.out.println(y); // Not allowed since y is non-static
    }
}

public class StaticDemo2 {

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        st1.show(); // 10 20
        st1.x=30;
        st1.y=50;

        StaticTest st2 = new StaticTest();
        st2.show(); // 30 20 since x is a static and is shared by all members doing st1.x has also changed st2.x

    }
}
