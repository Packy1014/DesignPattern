# Adapter

Adapter is a design pattern that allows objects with incompatible interfaces to collaborate.
An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes.
The wrapped object isn’t even aware of the adapter.

1. ___Applicability___
    * Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code.
      The Adapter pattern lets you create a middle-layer class that serves as a translator between your code and a legacy class, a 3rd-party class or any other class with a weird interface.
    * Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.
      You could extend each subclass and put the missing functionality into new child classes.
      However, you’ll need to duplicate the code across all of these new classes, which smells really bad.
      The much more elegant solution would be to put the missing functionality into an adapter class.
      Then you would wrap objects with missing features inside the adapter, gaining needed features dynamically.

2. ___Pros___
    * Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.
    * Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.

3. ___Cons___
    * The overall complexity of the code increases because you need to introduce a set of new interfaces and classes.
      Sometimes it’s simpler just to change the service class so that it matches the rest of your code.

4. ___Usage of the pattern in Java___
    * java.util.Arrays#asList()
    * java.util.Collections#list()
    * java.io.InputStreamReader(InputStream) (returns a Reader object)
    * java.io.OutputStreamWriter(OutputStream) (returns a Writer object)

> _Identification:_ Adapter is recognizable by a constructor which takes an instance of a different abstract/interface type.
  When the adapter receives a call to any of its methods, it translates parameters to the appropriate format and then directs the call to one or several methods of the wrapped object.