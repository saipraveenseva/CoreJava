/*
Built-in exception classes in java
Hierarchy
        Object
            |
        Throwable
            |
   Exception  Error
-ClassNotFoundException
-IOException(Accessing files)
-InterruptedException(Multithreading related)
-NumberFormatException
-RuntimeException
        -ArithmeticException
        -IndexOutOfBoundException
        -NullPointerException

Two types of exceptions:
1. Checked exceptions: You must handle these exceptions if there is a possibility of such exceptions. java  compiler forces you to write try and catch for these.
2. Unchecked exceptions: Not mandatory to handle them.

All the above exceptions except run time exceptions are run time exceptions.

*While writing multiple catch blocks we need to follow the hierarchy of the classes.

try{

}

catch(ArithmeticException e){     // Arithmetic Exception is a subclass. so it should be on top. So the compiler will handle specific exceptions. The other way around is not valid because if the compiler first sees Exception e, It won't go any further. It will handle all the exceptions and not each one specifically.
}

catch(Exception e){ // Exception is a super class, so it should be on bottom.
}

Exception class is a superclass, if you wish to write your own user defined exception we need to extend Exception class

 */



public class ExceptionClassesDemo {


    public static void main(String[] args) {
        int a=10;
        int b=0;
        int minBal=1000;

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e); // Prints the exception
            System.out.println(e.getMessage()); // Prints the message of the exception
        }
    }
}
