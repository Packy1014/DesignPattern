# Iterator

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

1. ___Applicability___
    * Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically.
    * Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases. The subscription list is dynamic, so subscribers can join or leave the list whenever they need to.

2. ___Pros___
    * Open/Closed Principle. You can introduce new subscriber classes without having to change the publisher’s code (and vice versa if there’s a publisher interface).
    * You can establish relations between objects at runtime.

3. ___Cons___
    * Subscribers are notified in random order.

4. ___Usage of the pattern in Java___
    * java.util.Observer / java.util.Observable
    * java.util.EventListener

> _Identification:_ The pattern can be recognized by subscription methods, that store objects in a list and by calls to the update method issued to objects in that list..