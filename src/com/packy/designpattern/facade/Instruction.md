# Facade

Facade is a design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

1. ___Applicability___
    * Use the Facade pattern when you need to have a limited but straightforward interface to a complex subsystem.
    * Use the Facade when you want to structure a subsystem into layers. Create facades to define entry points to each level of a subsystem.
      You can reduce coupling between multiple subsystems by requiring them to communicate only through facades.
      For example, let’s return to our video conversion framework. It can be broken down into two layers: video- and audio-related.
      For each layer, you can create a facade and then make the classes of each layer communicate with each another via those facades.

2. ___Pros___
    * You can isolate your code from the complexity of a subsystem.

3. ___Cons___
    * A facade can become a god object coupled to all classes of an app.

4. ___Usage of the pattern in Java___
    * javax.servlet.ServletContext
    * javax.servlet.http.HttpSession

> _Identification:_ Facade can be recognized in a class that has a simple interface, but delegates most of the work to other classes.
> Usually, facades manage the full life cycle of objects they use.