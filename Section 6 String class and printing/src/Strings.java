public class Strings {
    public static void main(String[] args) {

        String str1="Java Program";

        //str1 is a reference to the object "Java program"
        //String is the class
        //It is stored as an array of characters.

        // str1 --> j a v a  p r o g r a m
        //          0 1 2 3 4 5 6 7 8 9 10 11

        /*
        --------String constructors--------

        ----String(char[])----
        char c[]={'A','B','C','D'};
        String str1= new String(c)
        str1--> A B C D
                0 1 2 3

         ----String(byte[])----
         byte b[]={65,66,67,68}; // ASCII values
         String str2=new String(b);
         str2--> A B C D
                 0 1 2 3

         ----String(string)----
         String str1=new String("java");
         str1--> Java
         2 objects will be created here.
         one is str1 that points to the string literal "java'
         another is the string literal "java" itself. This is stored in pool of string constants.

         String str1 = "Java";
         String str2 = "Java";

         Now only 1 object will be created.
         str1, str2 are variables and "Java" is an object. THis is becoz there is no "new" keyword.
         Both str1 and str2 are pointed towards "Java" string literals
         Same happens with arrays in Java

         String str3=new String("Java");
         Now a new object str3 is created becoz of the new keyword.
         Since the string literal "Java" is already created. it will not create another string literals
         The object str3 will point towards the existing string literal "Java".

         */

        String str2="java"; // This is in string pool area
        String str3=new String("JAVA"); // THis is created in heap
        System.out.println(str3);

        char c[]={'h', 'e', 'l', 'l', 'o'};
        String str4=new String(c);
        System.out.println(str4);

        byte b[]={65,66,67,68};
        String str5=new String(b);
        System.out.println(str5);//ABCD
        String str6=new String(b,2,2);
        System.out.println(str6); //CD

        String str7="Java";
        String str8="Java";
        System.out.println(str7==str8); //true since both are pointing towards same literals.

        String str9="Java";
        String str10= new String("Java");
        System.out.println(str9==str10); // false since one is a pool and one is in heap/

        // -----------------------String methods------------------------------
         String str="Sai praveen Seva";

        System.out.println(str.length()); //16

        str.toLowerCase(); //Result of this is ignored because strings are immutable.
        String str11=str.toLowerCase(); // This will work fine since we are creating a new variable.
        System.out.println(str11);
        System.out.println(str.toLowerCase()); //Lower case
        System.out.println(str.toUpperCase()); //

        System.out.println(str.trim()); // Trims the spaces

        System.out.println(str.substring(4)); // prints substring
        System.out.println(str.substring(4,10)); // overloaded method, you can give starting and ending index/
        System.out.println(str.replace('e','&')); // replaces e with &

        String str12="Mr. Shahrukh khan";
        System.out.println(str12.startsWith("Shah")); // returns false since the str12 does not start with "Shah"
        System.out.println(str12.startsWith("Mr")); // return true since str12 starts with "Mr"
        System.out.println(str12.startsWith("Shah",4)); // returns true since we  have "Shah" at index 4
        System.out.println(str12.endsWith("Khan")); // returns true since it ends with "Khan".

        System.out.println(str12.charAt(4)); // S
        for(int i=0;i<str12.length();i++){
            System.out.print(str12.charAt(i)); // Prints using for loop
        }
        System.out.println();

        System.out.println(str12.indexOf('S')); // 4
        System.out.println(str12.indexOf("Shah"));// Also takes string as a parameter.
        System.out.println(str12.indexOf("k",10)); //returns index of k after index 10. returns -1 if it doesn't exist.
        System.out.println(str12.lastIndexOf('k')); // returns last index of k


        String str13="Pyramid";
        String str14="Pyramid";
        String str15="pyramid";
        String str16=new String("Pyramid");
        String str17="a";
        String str18="g";

        System.out.println(str13==str14); // both are same returns true. Both point to same literal
        System.out.println(str13==str15); //str15 is lower case
        System.out.println(str13.equalsIgnoreCase(str15)); // returns true since it ignores the cases.
        System.out.println(str13==str16); // false since str16 is in heap.
        System.out.println(str13.equalsIgnoreCase(str16)); // it checks for contents of both variables. Since the contents are same it returns true

        System.out.println(str13.compareTo(str16)); // returns 0 if both the contents are same and -1 if they are different.
        System.out.println(str17.compareTo(str18)); // returns -6 compares the ASCII values in the literal. a=97 and b=103 returns negative difference between ascii value
        System.out.println(str18.compareTo(str17)); // returns +6

        System.out.println(str15.contains("ram")); // ram is present in pyramid

        System.out.println(str13.concat(str14)); //PyramidPyramid






    }
}
