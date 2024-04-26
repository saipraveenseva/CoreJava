/*
-Packages are collections of classes, interfaces or other packages.
-Helpful in organising the project
-import java.lang.* is the default package in java. Contains inbuilt java files.
-There are in-built and user defined packages.


Naming conventions for packages
University project
student class
faculty class
course class
books class
Library class

some inner packages could be
.academics
.admissions
.examination

so package name convention should be

com.univ.academic.student
domain.projectname.innerpackagename.classname

 */

//import java.lang.String; // Since java.lang.* is a default package no need to write like this.
package mypack1;

public class packagesDemo {
    public void display(){ // This has to be public to be accessed outside of this package.
        System.out.println("This is packages demo");
    }
}

