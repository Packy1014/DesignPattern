# Composite

Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
The Visitor pattern suggests that you place the new behavior into a separate class called visitor, instead of trying to integrate it into existing classes.
The original object that had to perform the behavior is now passed to one of the visitor’s methods as an argument, providing the method access to all necessary data contained within the object.
But how exactly would we call these methods, especially when dealing with the whole graph? These methods have different signatures, so we can’t use polymorphism.
However, the Visitor pattern addresses this problem. It uses a technique called Double Dispatch, which helps to execute the proper method on an object without cumbersome conditionals.
Instead of letting the client select a proper version of the method to call, how about we delegate this choice to objects we’re passing to the visitor as an argument?
Since the objects know their own classes, they’ll be able to pick a proper method on the visitor less awkwardly. They “accept” a visitor and tell it what visiting method should be executed.
Now, if we extract a common interface for all visitors, all existing nodes can work with any visitor you introduce into the app.
If you find yourself introducing a new behavior related to nodes, all you have to do is implement a new visitor class.

1. ___Applicability___
    * Use the Visitor when you need to perform an operation on all elements of a complex object structure (for example, an object tree).
    * Use the Visitor to clean up the business logic of auxiliary behaviors.
    * Use the pattern when a behavior makes sense only in some classes of a class hierarchy, but not in others.
      You can extract this behavior into a separate visitor class and implement only those visiting methods that accept objects of relevant classes, leaving the rest empty.

2. ___Pros___
    * Open/Closed Principle. You can introduce a new behavior that can work with objects of different classes without changing these classes.
    * Single Responsibility Principle. You can move multiple versions of the same behavior into the same class.
    * A visitor object can accumulate some useful information while working with various objects. This might be handy when you want to traverse some complex object structure,
      such as an object tree, and apply the visitor to each object of this structure.

3. ___Cons___
    * You need to update all visitors each time a class gets added to or removed from the element hierarchy.
    * Visitors might lack the necessary access to the private fields and methods of the elements that they’re supposed to work with.

4. ___Usage of the pattern in Java___
    * java.nio.file.FileVisitor