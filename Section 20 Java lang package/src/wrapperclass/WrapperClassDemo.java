package wrapperclass;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int i=10; // Primitive datatype. Primitives are not objects.
                    // If primitives are objects if I do i. It should list of the methods.
        // Java is called pure object-oriented programming language.
        // So we want classes for primitive data types as well so that we can treat these as objects.
        // Such classes are called Wrapper classes.
        /*
            Wrapper classes are available for Character, Byte, Short, Integer, Float, Long, Double, Boolean primitive data types.
            All these classes are available in java.lang package

            Example  java.lang.Object --> java.lang.Number --> java.lang.Integer  this is the inheritance hierarchy.

            THe hierarchy looks like this.

            Object is inherited by Number, Character and Boolean classes
            All the primitive datatypes are inherited from Number class.


         */

       // Integer i = new Integer(10); deprecated

        Integer a = Integer.valueOf(10); // This is the new norm
        int b=10;

        // Now we can perform operations with a. It will list out the methods.

        System.out.println(a.equals(b)); // Returns true

        Byte c = 15;
        Byte d = Byte.valueOf("15");    // Accepts String parameters or byte datatypes
        //Byte e=Byte.valueOf(15); // Not accepted because 15 is an integer.
        byte bb = 15;
        Byte e=Byte.valueOf(bb); // Accepted because bb is of type byte.

        Short f = Short.valueOf("123"); // Same logic for Short as well

        Float g=12.3f; // f is required.

        Float h = Float.valueOf("123.4f");
        // Float hh = Float.valueOf(123.2); Same logic

        Double j = Double.valueOf(123.456); // Accepts the values as is. No need to represent it as String

        Character k = Character.valueOf('A'); // Only single quotes

        Boolean l = Boolean.valueOf("True"); // Accepts string or bool types

        /*  Why are they called Wrapper classes?

            byte bb = 15;
            Byte e=Byte.valueOf(bb);

            COnsider this example.
            bb is of type byte.
            e is an object that holds the reference of bb.
            its like variable bb is boxed by object e.
            object e wraps the variable bb. This concept is also called boxing.

            auto-boxing: automatic conversion of primitives to their corresponding wrapper objects
            auto-unboxing: automatic conversion of wrapper objects to their corresponding primitive types

         */

        System.out.println(h.floatValue()); // 123.4

        /*  Unboxing
            Float h=Float.valueOf("123.4");
            float x = h.floatValue(); // This is called unboxing where we assign the objects value to an primitive type(x)
            float y=h; // We dont need to explicitly call .floatValue(), it will automatically call the method. This is called auto-unboxing.

            int m=10;
            Integer n = Integer.valueOf(m); // This is how we write in general.
            Integer n=m;  Similar way this is auto-boxing
            Integer p =n; auto-unboxing.

         */



        /* Why does the concept of WrapperClasses exist?/

        Wrapper classes in Java exist to provide a way to use primitive data types (like int, char, double, etc.) as objects. This is necessary because Java is an object-oriented language, and many of its features (like collections, generics, and certain API methods) require objects rather than primitive types. Here are some key reasons why wrapper classes are important:

                ***Collections Framework: The Java Collections Framework, including classes like ArrayList, HashMap, etc., works with objects. Wrapper classes allow you to store primitive values in these collections.

                java
                Copy code
                ArrayList<Integer> list = new ArrayList<>();
                list.add(10);  // Autoboxing converts int to Integer

                ***Autoboxing and Unboxing: Java provides autoboxing (automatic conversion of primitives to their corresponding wrapper objects) and unboxing (automatic conversion of wrapper objects to their corresponding primitive types). This simplifies the code and makes it easier to work with collections and other APIs.

                java
                Copy code
                Integer i = 5;  // Autoboxing
                int j = i;      // Unboxing

                ***Null Values: Primitive data types cannot be null, whereas wrapper classes can. This is useful in cases where a null value is needed to indicate the absence of a value, such as in data structures or database results.

                java
                Copy code
                Integer i = null;  // Valid
                int j = null;      // Compilation error

                ***Utility Methods: Wrapper classes provide several utility methods for converting between different types and for parsing strings to primitive values.

                java
                Copy code
                int i = Integer.parseInt("123");
                String s = Integer.toString(123);

                ***Type Safety with Generics: Generics in Java only work with objects. Wrapper classes enable you to use primitive values with generics, ensuring type safety at compile time.

                java
                Copy code
                List<Double> list = new ArrayList<>();
                list.add(3.14);  // Autoboxing

                ***Immutability: Wrapper classes are immutable, which means that once an object is created, its value cannot be changed. This can be useful for maintaining the integrity of data and for use in concurrent programming.

                Wrapper classes in Java include Integer, Double, Float, Long, Short, Byte, Character, and Boolean, each corresponding to a primitive data type. They help bridge the gap between Java's object-oriented nature and the need to work with primitive data types.

         */

    }
}
