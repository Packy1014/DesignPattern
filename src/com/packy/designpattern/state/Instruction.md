# State

State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.
The main idea is that, at any given moment, there’s a finite number of states which a program can be in.
Within any unique state, the program behaves differently, and the program can be switched from one state to another instantaneously.
State machines are usually implemented with lots of conditional statements (if or switch).
Code like this is very difficult to maintain because any change to the transition logic may require changing state conditionals in every method.
The problem tends to get bigger as a project evolves. It’s quite difficult to predict all possible states and transitions at the design stage.
Instead of implementing all behaviors on its own, the original object, called context, stores a reference to one of the state objects that represents its current state, and delegates all the state-related work to that object.

1. __Applicability__
    * Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
      The pattern suggests that you extract all state-specific code into a set of distinct classes. As a result, you can add new states or change existing ones independently of each other, reducing the maintenance cost.
    * Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class’s fields.

2. __Pros__
    * Single Responsibility Principle. Organize the code related to particular states into separate classes.
    * Open/Closed Principle. Introduce new states without changing existing state classes or the context.
    * Simplify the code of the context by eliminating bulky state machine conditionals.

3. __Cons__
    * Applying the pattern can be overkill if a state machine has only a few states or rarely changes.

4. __Usage of the pattern in Java__
    * javax.faces.lifecycle.LifeCycle#execute()

> _Identification:_ State pattern can be recognized by methods that change their behavior depending on the objects’ state, controlled externally.