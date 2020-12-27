# Command

Command is a design pattern that turns a request into a stand-alone object that contains all information about the request.
This transformation lets you parameterize methods with different requests, delay or queue a request’s execution, and support undoable operations.

1. ___Applicability___
    * Use the Command pattern when you want to parametrize objects with operations.
      The Command pattern can turn a specific method call into a stand-alone object.
      This change opens up a lot of interesting uses: you can pass commands as method arguments, store them inside other objects, switch linked commands at runtime, etc.
    * Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
      As with any other object, a command can be serialized, which means converting it to a string that can be easily written to a file or a database.
      Later, the string can be restored as the initial command object. Thus, you can delay and schedule command execution.
      But there’s even more! In the same way, you can queue, log or send commands over the network.
    * Use the Command pattern when you want to implement reversible operations.

2. ___Pros___
    * Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform these operations.
    * Open/Closed Principle. You can introduce new commands into the app without breaking existing client code.
    * You can implement undo/redo.
    * You can implement deferred execution of operations.
    * You can assemble a set of simple commands into a complex one.

3. ___Cons___
    * The code may become more complicated since you’re introducing a whole new layer between senders and receivers.

4. ___Usage of the pattern in Java___
    * java.lang.Runnable
    * javax.swing.Action

> _Identification:_ These classes should implement the same interface/abstract class.
> The commands may implement the relevant actions on their own or delegate the work to separate objects—that will be the receivers.