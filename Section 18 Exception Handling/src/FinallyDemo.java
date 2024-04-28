public class FinallyDemo {

    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }// This will cause an arithmetic exception and the program crashes with an error and no further lines of code are executed.
        finally{                        // What if I want to print this final message even though program crashes, then I will put the message in the finally block.
            System.out.println("Final message before termination"); // Try block is mandatory for the finally block. No mandate for catch blocks.
        }

        // Generally speaking if there is an exception is caught it wont crash the code and next lines of code will execute just fine.
        //What if there is a situation where we dont know an exception might or might not occur and we didnt write any try catch blocks to catch it and still wish to execute a certain line/block of code, then we write them in finally block'
        // works same if we are explicitly throwing an exception.

        /*
        Another decent example for the use of finally is when we are dealing with the resources.
        A common and an obvious notion in programming when it comes to resources is we acquire the resource, use them and return them once we are done.

        int meth() throws Exception{
            FileReader f; Some inbuilt FileReader function
            f=new FileReader("my.txt");
            //use file
            f.close();
            return result;
        }

        Observe the above code and we have a hypothetical, we acquired a resource called my.txt
        we used it and we close it. thats how it should be done.
        What if we got an exception in a block of code where we are using the file. it will throw an error and the program will be terminated at that line.
        f.close wont be executed until the exeception is addressed which leads to blocking of resources.
        The soultion would be writing the f.close(); inside a finally block.
        In that way, irrespective of exception, the f.close(); line will execute the my.txt resource will be released
         finally{
         f.close();
         }


         THere is another concept called "Try with resources" . THis is a new concept.
         This does not require us to explicitly write finally. we can just use try.

         but try has to be written like this.

         try(FileReader f = new FileReader("my.txt")){
         // resource use
         }

         the above statements will release the resources if any exceptions occur.


         */

    }
}
