# Proxy

Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

1. ___Applicability___
    * Lazy initialization. This is when you have a heavyweight service object that wastes system resources by being always up, even though you only need it from time to time.
    * Access control. This is when you want only specific clients to be able to use the service object.
      For instance, when your objects are crucial parts of an operating system and clients are various launched applications
    * Logging requests. This is when you want to keep a history of requests to the service object.
    * Caching request results. This is when you need to cache results of client requests and manage the life cycle of this cache, especially if results are quite large.
    * Smart reference. This is when you need to be able to dismiss a heavyweight object once there are no clients that use it.
      From time to time, the proxy may go over the clients and check whether they are still active. If the client list gets empty, the proxy might dismiss the service object and free the underlying system resources.

2. ___Pros___
    * You can control the service object without clients knowing about it.
    * You can manage the lifecycle of the service object when clients don't care about it.
    * The proxy works even if the service object isn't ready or is not available.
    * Open/Closed Principle. You can introduce new proxies without changing the service or clients.

3. ___Cons___
    * The code may become more complicated since you need to introduce a lot of new classes.
    * The response from the service might get delayed.

4. ___Usage of the pattern in Java___
    * java.lang.reflect.Proxy

> _Identification:_ Proxies delegate all the real works to some other object. Each proxy method should, in the end, refer to a service object unless the proxy is a subclass of a service.