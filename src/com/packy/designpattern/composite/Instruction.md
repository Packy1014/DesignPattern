# Composite

Composite is a design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.
For example, imagine that you have two types of objects: Products and Boxes. A Box can contain several Products as well as a number of smaller Boxes.
These little Boxes can also hold some Products or even smaller Boxes, and so on.

1. ___Applicability___
    * Use the Composite pattern when you have to implement a tree-like object structure.
      The Composite pattern provides you with two basic element types that share a common interface: simple leaves and complex containers.
      A container can be composed of both leaves and other containers. This lets you construct a nested recursive object structure that resembles a tree.
    * Use the pattern when you want the client code to treat both simple and complex elements uniformly.
      All elements defined by the Composite pattern share a common interface.
      Using this interface, the client doesn't have to worry about the concrete class of the objects it works with.

2. ___Pros___
    * You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
    * Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, which now works with the object tree.

3. ___Cons___
    * It might be difficult to provide a common interface for classes whose functionality differs too much.
      In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.

4. ___Usage of the pattern in Java___
    * java.awt.Container#add(Component)

> _Identification:_ If you have an object tree, and each object of a tree is a part of the same class hierarchy, this is most likely a composite.
> If methods of these classes delegate the work to child objects of the tree and do it via the base class/interface of the hierarchy, this is definitely a composite.