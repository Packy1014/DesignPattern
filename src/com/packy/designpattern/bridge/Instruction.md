# Bridge

Bridge is a design pattern that lets you split a large class, or a set of closely related classes into two separate hierarchies,
abstraction and implementation, which can be developed independently of each other.
The Bridge pattern attempts to switch from inheritance to the object composition. What this means is that you extract one of the dimensions into a separate class hierarchy,
so that the original classes will reference an object of the new hierarchy, instead of having all of its states and behaviors within one class.

1. ___Applicability___
    * Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality (for example, if the class can work with various database servers).
      The changes made to one of the variations of functionality may require making changes across the whole class, which often results in making errors or not addressing some critical side effects.
      The Bridge pattern lets you split the monolithic class into several class hierarchies.
      After this, you can change the classes in each hierarchy independently of the classes in the others.
      This approach simplifies code maintenance and minimizes the risk of breaking existing code.
    * Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
    * Use the Bridge if you need to be able to switch implementations at runtime.

2. ___Pros___
    * The client code works with high-level abstractions. It isn’t exposed to the object details.
    * Open/Closed Principle. You can introduce new abstractions and implementations independently of each other.
    * Single Responsibility Principle. You can focus on high-level logic in the abstraction and on object details in the implementation.

3. ___Cons___
    * You might make the code more complicated by applying the pattern to a highly cohesive class.