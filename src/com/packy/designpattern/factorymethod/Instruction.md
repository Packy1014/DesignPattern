# Factory Method

Factory Method is a design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
The code that uses the factory method (often called the client code) doesn't see a difference between the actual products returned by various subclasses.

1. ___Applicability___
    * Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
      The Factory Method separates product construction code from the code that actually uses the product.
      Therefore it’s easier to extend the product construction code independently from the rest of the code.
      For example, to add a new product type to the app, you’ll only need to create a new creator subclass and override the factory method in it.
    * Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.

2. ___Pros___
    * You avoid tight coupling between the creator and the concrete products.
    * Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
    * Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

3. ___Cons___
    * The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern.
      The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.

4. ___Usage of the pattern in Java___
    * java.util.Calendar#getInstance()
    * java.util.ResourceBundle#getBundle()
    * java.text.NumberFormat#getInstance()
    * java.nio.charset.Charset#forName()

> _Identification:_ Factory methods can be recognized by creation methods, which create objects from concrete classes, but return them as objects of abstract type or interface.