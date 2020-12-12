# Chain of Responsibility

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

1. ___Applicability___
    * Use the Chain of Responsibility pattern when your program is expected to process different kinds of requests in various ways,
      but the exact types of requests, and their sequences are unknown beforehand.
      The pattern lets you link several handlers into one chain and, upon receiving a request, "ask" each handler whether it can process it.
      This way all handlers get a chance to process the request.
    * Use the pattern when it’s essential to execute several handlers in a particular order.
      Since you can link the handlers in the chain in any order, all requests will get through the chain exactly as you planned.
    * Use the CoR pattern when the set of handlers, and their order are supposed to change at runtime.
      If you provide setters for a reference field inside the handler classes, you’ll be able to insert, remove or reorder handlers dynamically.

2. ___Pros___
    * You can control the order of request handling.
    * Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code.

3. ___Cons___
    * Some requests may end up unhandled.

4. ___Usage of the pattern in Java___
    * javax.servlet.Filter#doFilter()

> _Identification:_ The pattern is recognizable by behavioral methods of one group of objects that indirectly call the same methods in other objects, while all the objects follow the common interface.