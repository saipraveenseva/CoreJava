/*
In the terminology of C++
Phone, camera and musicplayer and 3 individual classes with diff functionalities.
we write a class smartphone that inherits all these 3 classes. This is called multiple inheritance.

But in Java, we see this as
A smartphone is a phone, and it has the interfaces(features) of camera and musicplayer.
It makes more sense. A car is a class. Suzuki inherits Car class and implements musicplayer interface.

Multiple inheritance refers to the ability of a class to inherit from more than one superclass.
Java does not allow multiple inheritance for several reasons:

Diamond Problem: In languages that allow multiple inheritance, such as C++, there can be issues with the diamond problem.
This occurs when a class inherits from two classes that have a common ancestor.
It can lead to ambiguity in method resolution and increase the complexity of the language.
For example, consider classes A, B, and C where both B and C inherit from A, and class D inherits from both B and C:

If B and C override the same method from A, which implementation should D inherit?
This ambiguity is known as the diamond problem.
Complexity: Allowing multiple inheritance increases the complexity of the language and can make the code harder to understand and maintain.
It introduces more potential for conflicts, ambiguity, and unintended consequences.
Interface Implementation: Java provides interfaces as a means to achieve multiple inheritance of type, where a class can implement multiple interfaces but inherit from only one class.
This simplifies the language while still allowing for polymorphism and code reuse through interfaces.
Cyclic Dependencies: Multiple inheritance can introduce cyclic dependencies between classes, leading to issues with class initialization and object creation.
By disallowing multiple inheritance, Java promotes a simpler and more predictable object-oriented programming model while still providing flexibility through interfaces and composition. Developers can achieve code reuse and polymorphism through interfaces and delegation, which are less prone to the issues associated with multiple inheritance.

*/

public class MultipleInheritance {
}
