# Mediator

Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

1. ___Applicability___
   * Use the Mediator pattern when it’s hard to change some of the classes because they are tightly coupled to a bunch of other classes.
     The pattern lets you extract all the relationships between classes into a separate class, isolating any changes to a specific component from the rest of the components.
   * Use the pattern when you can’t reuse a component in a different program because it’s too dependent on other components.
     After you apply the Mediator, individual components become unaware of the other components. They could still communicate with each other, albeit indirectly, through a mediator object.
     To reuse a component in a different app, you need to provide it with a new mediator class.
   * After you apply the Mediator, individual components become unaware of the other components. They could still communicate with each other, albeit indirectly, through a mediator object.
     To reuse a component in a different app, you need to provide it with a new mediator class.
     Since all relations between components are contained within the mediator, it’s easy to define entirely new ways for these components to collaborate by introducing new mediator classes,
     without having to change the components themselves.

2. ___Pros___
   * Single Responsibility Principle. You can extract the communications between various components into a single place, making it easier to comprehend and maintain.
   * Open/Closed Principle. You can introduce new mediators without having to change the actual components.
   * You can reduce coupling between various components of a program.
   * You can reuse individual components more easily.

3. ___Cons___
   * Over time a mediator can evolve into a God Object.
     A god object (sometimes also called an omniscient or all-knowing object) is an object that references a large number of distinct types, has too many unrelated or uncategorized methods, or some combination of both.

4. ___Usage of the pattern in Java___
* java.util.concurrent.Executor#execute()
* java.util.concurrent.ExecutorService (invokeXXX() and submit() methods)
* java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)