# Decorator

Decorator is a design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

1. ___Applicability___
    * Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects.
    * Use the pattern when it’s awkward or not possible to extend an object’s behavior using inheritance.

2. ___Pros___
    * You can extend an object’s behavior without making a new subclass.
    * You can add or remove responsibilities from an object at runtime.
    * You can combine several behaviors by wrapping an object into multiple decorators.

3. ___Cons___
    * It’s hard to remove a specific wrapper from the wrappers stack.

4. ___Usage of the pattern in Java___
    * java.util.Collections#unmodifiableXXX()
    * java.io.InputStream

> _Identification:_ Decorator can be recognized by creation methods or constructor that accept objects of the same class or interface as a current class.