
class FinalSuper{
    final void meth1(){
        System.out.println("hello from final meth1");
    }
}

class Sub extends FinalSuper{

    //void meth1(){ // throws an error becoz we cannot override final methods.
        //System.out.println("hi from inherited meth1 from subclass");
    //}

    void meth2(){
        System.out.println("Hi from meth2 sub class");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.meth1();
        s.meth2();
    }
}
