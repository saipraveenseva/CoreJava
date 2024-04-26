/*
I created 2 packages mypack1 and mypack2 and wrote 2 display classes in them
 */
import mypack1.*; // Accessing all files in the package
import mypack2.packagesDemo2; // Accessing only packagesDemo2 from mypack2
import mypack2.mypack3.*; // mypack3 package is a subpackage of mypack2. we can access package within a package like this.

// I imported those packages here and created objects in this file.
public class PackagesTest {
    public static void main(String[] args) {
        packagesDemo pd1 = new packagesDemo();
        packagesDemo2 pd2 = new packagesDemo2();
        //packagesDemoX pdx = new packagesDemoX(); // mypack2 contains 2 classes packagesDemo2 and packagesDemoX but I imported only one so this throws an error.
        packagesDemo3 pd3 = new packagesDemo3();
        pd1.display();
        pd2.display();
        pd3.display();

    }
}
