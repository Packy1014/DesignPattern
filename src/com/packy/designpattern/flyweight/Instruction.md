# Flyweight

Flyweight is a design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all the data in each object.

1. ___Applicability___
    * Use the Flyweight pattern only when your program must support a huge number of objects which barely fit into available RAM.
    * The benefit of applying the pattern depends heavily on how and where it’s used. It’s most useful when:
        + An application needs to spawn a huge number of similar objects.
        + This drains all available RAM on a target device.
        + The objects contain duplicate states which can be extracted and shared between multiple objects.

2. ___Pros___
    * You can save lots of RAM, assuming your program has tons of similar objects.

3. ___Cons___
    * You might be trading RAM over CPU cycles when some context data needs to be recalculated each time somebody calls a flyweight method.
    * The code becomes much more complicated. New team members will always be wondering why the state of an entity was separated in such a way.

4. ___Usage of the pattern in Java___
    * java.lang.Integer#valueOf(int) (also Boolean, Byte, Character, Short, Long and BigDecimal)

> _Identification:_ Flyweight can be recognized by a creation method that returns cached objects instead of creating new.