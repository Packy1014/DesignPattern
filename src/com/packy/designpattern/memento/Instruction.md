# Memento

Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.
The Memento pattern delegates creating the state snapshots to the actual owner of that state, the originator object.
Hence, instead of other objects trying to copy the editor’s state from the "outside", the editor class itself can make the snapshot since it has full access to its own state.

1. ___Applicability___
    * Use the Memento pattern when you want to produce snapshots of the object’s state to be able to restore a previous state of the object.
    * Use the pattern when direct access to the object’s fields/getters/setters violates its encapsulation.

2. ___Pros___
    * You can produce snapshots of the object’s state without violating its encapsulation.

3. ___Cons___
    * The app might consume lots of RAM if clients create mementos too often.
    * Most dynamic programming languages, such as PHP, Python and JavaScript, can’t guarantee that the state within the memento stays untouched.

4. ___Usage of the pattern in Java___
    * javax.faces.component.StateHolder