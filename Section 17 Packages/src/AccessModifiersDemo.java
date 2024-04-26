/*
-Useful to specify/modify different levels of access to the members in java
default
private
protected
public

-variables, methods, inner classes can be assigned all the access modifiers
-outer class can only public or default.

-A subclass contains a "isA" relationship with its super class.
-A class that creates an object of an external class contains a "hasA" relationship with that external class.

Access modifiers        Default     Private     Protected   Public

same class              Yes         Yes         Yes         Yes     // Members of the same class can be accessible anywhere within the class with all the access modifiers

same pack--subclass     Yes         No          Yes         Yes     // subclass can access only all the members of superclass within same package except private members.

same pack--non-subclass Yes         No          Yes         Yes     // non-subclass can access only all the members of superclass within same package except private members.

Diff pack--subclass     No          No          Yes         Yes     // if the subclass in a diff package then it can only access protected and public members of the superclass and not default or private members.

Diff pack--nonsubclass  No          No          No          Yes     // A non-subclass in a diff package can only access public members of the superclass.

non-subclass: A class in which an object of the other class is created
same class: All the members are in same class and same package.
same pack--subclass: The subclass is in same package.
same pack--non-subclass: The class that created the object of the class is in same package
Diff pack--subclass: The subclass is in another package.
Diff pack--nonsubclass: The class that created the object of the class is in a different package




 */
public class AccessModifiersDemo {

}
