# Singleton

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called strategies.
The original class, called context, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.

1. __Applicability__
    * Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
    * Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
    * Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.
    * Use the pattern when your class has a massive conditional statement that switches between different variants of the same algorithm.

2. __Pros__
    * You can swap algorithms used inside an object at runtime.
    * You can isolate the implementation details of an algorithm from the code that uses it.
    * Open/Closed Principle. You can introduce new strategies without having to change the context.

3. __Cons__
    * If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.
    * Clients must be aware of the differences between strategies to be able to select a proper one.

4. __Usage of the pattern in Java__
    * java.util.Comparator#compare()

> _Identification:_ Strategy pattern can be recognized by a method that lets nested object do the actual work, as well as the setter that allows replacing that object with a different one.