package wrapperclass;

public class WrapperClassDemo2 {
    public static void main(String[] args) {
        int m1=15;
        Integer m2=m1;
        System.out.println(m1==m2); // true
        System.out.println(m2.equals(m1)); // true

        Integer m3=Integer.valueOf("123"); // Takes String input and converts to Integer. Can perform arithmatic operations on this too
        Integer m4=Integer.valueOf("1010",2); // Takes String input along with radix and considers it as a binary number and converts it to Integer. Can perform arithmetic operations on this as well.
        Integer m5=Integer.valueOf("A7",16); // Hex to Integer conversion

        System.out.println(m3+m4); // 123+10

        Integer m6 = Integer.bitCount(10);
        System.out.println(m6); // Displays the number of 1 bits in 10: 1010=2 count

        System.out.println(Integer.parseInt("123")); // Another way of converting String to Integer.

        //---------------Float------------------------

        float f1=12.5f;
        Float f2=12.5f;

        System.out.println("Comparing floats: "+f2.equals(f1));
        //System.out.println(f1.equals(f2));
        //This doesn't work becoz f1 is a primitive.

        Float f3=12.5f/0;
        Float f4=-12.5f/0;
        System.out.println("f3 infinite? :"+f3.isInfinite());
        System.out.println(f3==Float.POSITIVE_INFINITY);
        System.out.println(f4==Float.NEGATIVE_INFINITY);

        //--------- Try Character and Boolean classes as well.

        // Character Class Examples
        char ch1 = 'A';
        char ch2 = '1';
        char lowerCaseChar = 'a';
        char upperCaseChar2 = 'Z';
        char whitespaceChar = ' ';

        // Check if character is a letter
        boolean isLetter = Character.isLetter(ch1);
        System.out.println(ch1 + " is a letter: " + isLetter);

        // Check if character is a digit
        boolean isDigit = Character.isDigit(ch2);
        System.out.println(ch2 + " is a digit: " + isDigit);

        // Convert a character to uppercase
        char upperCaseChar = Character.toUpperCase(lowerCaseChar);
        System.out.println("Uppercase of " + lowerCaseChar + " is " + upperCaseChar);

        // Convert a character to lowercase
        char lowerCaseCharConverted = Character.toLowerCase(upperCaseChar2);
        System.out.println("Lowercase of " + upperCaseChar2 + " is " + lowerCaseCharConverted);

        // Check if character is whitespace
        boolean isWhitespace = Character.isWhitespace(whitespaceChar);
        System.out.println("'" + whitespaceChar + "' is whitespace: " + isWhitespace);

        // Boolean Class Examples
        // Creating Boolean objects
        Boolean bool1 = Boolean.valueOf("true");
        Boolean bool2 = Boolean.valueOf("false");

        System.out.println("Boolean 1: " + bool1);
        System.out.println("Boolean 2: " + bool2);

        // Parsing strings to booleans
        String strTrue = "true";
        String strFalse = "false";
        boolean parsedBool1 = Boolean.parseBoolean(strTrue);
        boolean parsedBool2 = Boolean.parseBoolean(strFalse);

        System.out.println("Parsed boolean 1: " + parsedBool1);
        System.out.println("Parsed boolean 2: " + parsedBool2);

        // Logical operations
        boolean andResult = bool1 && bool2;
        boolean orResult = bool1 || bool2;
        boolean notResult = !bool1;

        System.out.println("Logical AND result: " + andResult);
        System.out.println("Logical OR result: " + orResult);
        System.out.println("Logical NOT result: " + notResult);

    }
}