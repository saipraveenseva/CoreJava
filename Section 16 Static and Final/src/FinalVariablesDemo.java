/*
We have
-final variables
-final methods
-final class

-final variables are constant. the value cannot be changed.
- a notion in java is to write the final variables in capital letters
- a final variable can initialised when we declare it final int MIN=1;
- we can declare them outside and initialise them inside of a static block.
- we can initialise them even in constructors. If we have multiple constructors we have to intitialise them in all the constructors
becoz we dont know which one will be called.

A final variable cannot be modified
A final method cannot be overrided
A final class cannot be inherited.

Used to impose restrictions.

 */


class Final{
    final int MIN=0; // naming convention
    final static int NORMAL; // throws an error if we did not initialise
    final int MAX;  // throws an error if we did not initialise. If it is declared inside a method then its ok to initialise later. But as a class member final variables have to be initialised while we declare them

    static{
        NORMAL=5; // it has to be static as well to be accessed by static block
    }
    Final(){
        MAX=10; // Initialising in a constructor
    }

    Final(int x){
        MAX=x; // throws error if we did not intitialise the final variable in all the constructors
        //MIN=2; // throws error since final variable cannot be modified.
    }
}
public class FinalVariablesDemo {
    public static void main(String[] args) {
        Final f = new Final();
        System.out.println(f.MIN);
        System.out.println(f.NORMAL);
        System.out.println(Final.NORMAL); // since its static. no need of object.
        System.out.println(f.MAX);
    }
}
