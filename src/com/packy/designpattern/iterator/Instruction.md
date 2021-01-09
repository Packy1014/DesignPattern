# Iterator

Iterator is a design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

1. ___Applicability___
    * Use the Iterator pattern when your collection has a complex data structure under the hood, but you want to hide its complexity from clients.
    * Use the pattern to reduce duplication of the traversal code across your app.
    * Use the Iterator when you want your code to be able to traverse different data structures or when types of these structures are unknown beforehand.

2. ___Pros___
    * Single Responsibility Principle. You can clean up the client code, and the collections by extracting bulky traversal algorithms into separate classes.
    * Open/Closed Principle. You can implement new types of collections and iterators and pass them to existing code without breaking anything.
    * You can iterate over the same collection in parallel because each iterator object contains its own iteration state.
    * For the same reason, you can delay an iteration and continue it when needed.

3. ___Cons___
    * Applying the pattern can be an overkill if your app only works with simple collections.
    * The code becomes much more complicated. New team members will always be wondering why the state of an entity was separated in such a way.

4. ___Usage of the pattern in Java___
    * All implementations of java.util.Iterator
    * All implementations of java.util.Enumeration

> _Identification:_ Iterator is easy to recognize by the navigation methods (such as next, previous and others).
> Client code that uses iterators might not have direct access to the collection being traversed.