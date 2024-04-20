class Super2{
    void meth1(){
        System.out.println("Sup Meth1");
    }

    void meth2(){
        System.out.println("Sup meth2");
    }
}

class Sub2 extends Super2{
    void meth2(){
        System.out.println("sub meth2");
    }

    void  meth3(){
        System.out.println("sub meth3");
    }
}

public class DynamicMethodDispatch2 {
    public static void main(String[] args) {
    Super2 sup = new Sub2(); // This is valid
    //Sub sub = new Super2(); // A subclass reference pointing to superclass object is invalid

        sup.meth1(); // superclass meth1 is called becoz there is no meth1 in subclass
        sup.meth2(); // subclass meth2 is called becoz there is an overrided meth2 method in subclass
        //sup.meth3(); This is not valid becoz we are using superclass reference
        // methods are called depends on the object.

        // THis is called as runtime polymorphism.
        // Dynamic method dispatch is dynamically dispatching a method.
        // using new keyword objects are created at runtime.
        // So we are not sure which method is called until the object is created in runtime
        // Program takes a decision at runtime.
        // method overriding during runtime is called DMM and run time polymorphism.

    }
}
