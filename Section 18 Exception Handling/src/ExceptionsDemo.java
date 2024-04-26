/*
Exception handling
1. Syntax errors(syntactic, grammatic or spelling) can be removed with the help of a compiler.
2. Logical errors(defect in logic) can be removed by tracing or debuggers.
3. Runtime errors(memory issue, Invalid input, IO issue, network issues) are caused by improper use of program.

Both 1 and 2 are faced by programmers
Runtime errors often known as exceptions are face by the users.

Exception handling is the way of dealing with the run time errors by informing the user about the error and ways to fix it.
User cannot fix it, but he can change the way of using the program. Ex: providing a valid input, make sure connections are stable etc..

We write a block of code which may cause a run time exception in a try block and catch the exception in a catch block and print a relevant message along with the exception
We can have nested try catch blocks
We can have multiple catch blocks for a single try block
we can have multiple try and catch blocks
try can have a finally block but its optional, if there is an exception is found in try then catch will get executed.
finally will execute irrespective of finding an exception in try block

 */
public class ExceptionsDemo {
    public static void main(String[] args) {
        int a,b,c;
        a=10; b=0;
        int arr[]={10,0,2,3,4};


        try {   // I will write any such questionable logic inside a try block
            //c = a / b; // undefined arithmetic exception
            System.out.println(arr[0]/arr[1]);
             // Divide by zero exception

        }
        catch(ArithmeticException e){
            System.out.println("Undefined operation. " + e);
        }

        try{

            System.out.println(arr[10]); // Array Out of bound exception
        }
        catch(ArrayIndexOutOfBoundsException e){ // catch block for array index out of bound
            System.out.println(e);
        }

        System.out.println("Execution completed");
    }
}
