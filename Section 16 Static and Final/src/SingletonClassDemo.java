/*
A class which can create only a single object is called a singleton class.
 */

class CoffeeMachine{
    private float coffeeQty;
    private float waterQty;
    static private CoffeeMachine our=null; // creating a reference to the class and pointing it to null.
    // defined as static becoz only static members can access this.
    private CoffeeMachine(){ // private constructor does not allow creation of object for this class.
        coffeeQty=1;
        waterQty=1;
    }

    static public CoffeeMachine getInstance(){ // this will get an instance of the coffee machine class without creating an object.
        if(our ==  null){ // static member is accessing our here.
            our = new CoffeeMachine(); // first time when our is null it will create an object
            return our;
        }
        else{
            return our; // from second time our holds the object and no more objects are created.
        }
    }

}
public class SingletonClassDemo {

    CoffeeMachine cm = CoffeeMachine.getInstance();
}
