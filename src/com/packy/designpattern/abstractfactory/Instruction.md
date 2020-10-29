# Abstract Factory

Abstract Factory is a design pattern that lets you produce families of related objects without specifying their concrete classes.
Client code works with factories and products only through their abstract interfaces. This lets the client code work with any product variants, created by the factory object.
You just create a new concrete factory class and pass it to the client code.

1. ___Applicability___
    * Use the Abstract Factory when your code needs to work with various families of related products,
      but you don’t want it to depend on the concrete classes of those products — they might be unknown beforehand or you simply want to allow for future extensibility.
    * The Abstract Factory provides you with an interface for creating objects from each class of the product family.
      As long as your code creates objects via this interface, you don’t have to worry about creating the wrong variant of a product which doesn't match the products already created by your app.

2. ___Pros___
    * You can be sure that the products you’re getting from a factory are compatible with each other.
    * You avoid tight coupling between concrete products and client code.
    * Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.
    * Open/Closed Principle. You can introduce new variants of products without breaking existing client code.

3. ___Cons___
    * The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.

4. ___Usage of the pattern in Java___
* javax.xml.parsers.DocumentBuilderFactory#newInstance()
* javax.xml.transform.TransformerFactory#newInstance()
* javax.xml.xpath.XPathFactory#newInstance()

> _Identification:_ The pattern is easy to recognize by methods, which return a factory object. Then, the factory is used for creating specific sub-components.