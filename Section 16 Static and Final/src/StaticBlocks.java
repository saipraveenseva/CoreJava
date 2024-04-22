/*
Static blocks are blocks of code written in a class.
These are executed once the class is loaded into main memory
static blocks can only access static members.
There can more than one static blocks and they get executed in the order you defined them
Purpose?
If I wish to setup some static members I can write them into a static block.
all at one place.
Introduce in java 1.7 version
Not commonly used.

 */


class StaticBlocksDemo{
    static int s=10;
    int p=20;
    static{
        System.out.println("Static Block 1");
    }

    static{
        System.out.println("Static Block 2");
        System.out.println(s); // Only static members are allowed in the static blocks
        //System.out.println(p); // non-static member
    }
}
public class StaticBlocks {

    public static void main(String[] args) {

        System.out.println(StaticBlocksDemo.s); // Just access any members in the class will load the class and the static contents of the class are displayed.
        StaticBlocksDemo st = new StaticBlocksDemo(); // Even creating an object would load the class and print the contents of static blocks

    }
}


