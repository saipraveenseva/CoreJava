public class UserDefinedExceptions extends Exception {

      public String toString(){ // Overriding the toString inbuild method to print our custom message
        return "Minimum balance should be 1000";
    }
}

class Test{
    public static void main(String[] args) {
        try{
            throw new UserDefinedExceptions();
        }
        catch(UserDefinedExceptions e){
            System.out.println(e);
        }
    }
}
