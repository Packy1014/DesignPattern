# Singleton

Singleton is a design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
The most common reason for this is to control access to some shared resource—for example, a database or a file.
The Singleton pattern lets you access some object from anywhere in the program. However, it also protects that instance from being overwritten by other code.

1. __Applicability__
    * Use the Singleton pattern when a class in your program should have just a single instance available to all clients.
      For example, a single database object shared by different parts of the program.
    * Use the Singleton pattern when you need stricter control over global variables.

2. __Pros__
    * You can be sure that a class has only a single instance.
    * You gain a global access point to that instance.
    * The singleton object is initialized only when it’s requested for the first time.

3. __Cons__
    * Violates the Single Responsibility Principle. The pattern solves two problems at the time.
    * The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
    * It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects.
      Since the constructor of the singleton class is private and overriding static methods is impossible in most languages,
      you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern.

4. __Usage of the pattern in Java__
    * java.lang.Runtime#getRuntime()
    * java.awt.Desktop#getDesktop()
    * java.lang.System#getSecurityManager()

> _Identification:_ Singleton can be recognized by a static creation method, which returns the same cached object.
  A lot of developers consider the Singleton pattern an anti-pattern. That's why its usage is on the decline in Java code.