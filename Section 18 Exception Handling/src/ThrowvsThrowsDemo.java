public class ThrowvsThrowsDemo {
static int meth1() throws Exception // since we dont wish to handle the exception here we use throws Exception in the method declaration indicating the programmer that this method throws an exception and is handled further down the line.
{
    return 10/0; // Arithmetic unchecked exception
                // We don't wish to handle the exception here so we throw the exception to meth2. meth2 should have the try and catch blocks.
}

static void meth2() throws Exception{ // what if we dont want to handle the exception here either. we can throw it further back using throws exception.
    meth1();
}

static void meth3() { // We decided to handle the exception here in meth3 so we write try and catch blocks here.
    try {               // we can further throws this to main method and handle it over there by writing try and catch in main method.
        meth2();
    }
    catch(Exception e){
        System.out.println(e);
        //e.printStackTrace(); // this prints the stack of where it occured and display the path meth1, meth2 meth3.. Since its and error it is displayed as a red error message
    }
}

    public static void main(String[] args) {

        meth3(); // Since its an predefined exception we don't see any throw keyword anywhere because the compiler throws it for us.
    }
}
