
class negativeDimension extends Exception{
    public String toString(){ // Overriding the toString inbuild method to print our custom message
        return "Dimensions cannot be negative";
    }
}

public class ThrowvsThrowsDemo2 {
    static int area(int l, int b) throws negativeDimension // since we dont wish to handle the exception here we use throws Exception in the method declaration indicating the programmer that this method throws an exception and is handled further down the line.
    {
        if(l<0 || b<0) {
            throw new negativeDimension();
        }
        else
        {
            return l*b;
        }
    }


    static void meth2(int l, int b) throws negativeDimension{ // what if we dont want to handle the exception here either. we can throw it further back using throws exception.
        System.out.println(area(l,b));
    }
    static void meth3(int l, int b) { // We decided to handle the exception here in meth3 so we write try and catch blocks here.
        try {               // we can further throws this to main method and handle it over there by writing try and catch in main method.
            meth2(l,b);
        }
        catch(negativeDimension e){
            System.out.println(e);
            //e.printStackTrace(); // this prints the stack of where it occured and display the path meth1, meth2 meth3.. Since its and error it is displayed as a red error message
        }
    }

    public static void main(String[] args) {

        meth3(-10,2); // Since its an predefined exception we don't see any throw keyword anywhere because the compiler throws it for us.
    }
}
