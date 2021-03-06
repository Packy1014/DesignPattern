# Prototype

Prototype is a design pattern that lets you copy existing objects without making your code dependent on their classes.
The Prototype pattern delegates the cloning process to the actual objects that are being cloned.
The pattern declares a common interface for all objects that support cloning.
This interface lets you clone an object without coupling your code to the class of that object.

1. __Applicability__
    * Use the Prototype pattern when your code shouldn't depend on the concrete classes of objects that you need to copy.
    * Use the pattern when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects.
      Somebody could have created these subclasses to be able to create objects with a specific configuration.
      The Prototype pattern lets you use a set of pre-built objects, configured in various ways, as prototypes.

2. __Pros__
    * You can clone objects without coupling to their concrete classes.
    * You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
    * You can produce complex objects more conveniently.
    * You get an alternative to inheritance when dealing with configuration presets for complex objects.

3. __Cons__
    * Cloning complex objects that have circular references might be very tricky.

4. __Usage of the pattern in Java__
    * java.lang.Object#clone()

> _Identification:_ The prototype can be easily recognized by a clone or copy methods, etc.