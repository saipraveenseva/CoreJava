public class ExceptionsDemo2 {
    public static void main(String[] args) {
        int a,b;
        a=10; b=0;
        int arr[]={10,0,1,2,3};

        try{                                // Nested try-catch blocks
            //System.out.println(a/b);    // Since this is an exception the rest of the try block i.e nested try block won't be executed.
            // So always recommended to write the block of code that might cause an exception after the nested try block.
            try{
                System.out.println(arr[10]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Wrong reference: "+e);
            }
            System.out.println(a/b); // Now it will return both exceptions
        }
        catch(ArithmeticException e){
            System.out.println("Invalid operation: "+e);
        }


        System.out.println("Execution completed"); // This indicated the complete execution of the program irrespective of the run time error


    }
}
