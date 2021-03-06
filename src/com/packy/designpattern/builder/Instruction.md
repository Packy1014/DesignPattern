# Builder

Builder is a design pattern that lets you construct complex objects step by step, to avoid create a giant constructor with all possible parameters that control the object.
In most cases most of the parameters will be unused, making the constructor calls pretty ugly.
The builder pattern just let you execute a series of steps to build an object. The important part is that you don't need to call all of the steps.
You can call only those steps that are necessary for producing a particular configuration of an object.

1. ___Director___
    * The director class defines the order in which to execute the building steps, while the builder provides the implementation for those steps.
      Having a director class in your program isn't strictly necessary. You can always call the building steps in a specific order directly from the client code.
      However, the director class might be a good place to put various construction routines so you can reuse them across your program.
      In addition, the director class completely hides the details of product construction from the client code.
      The client only needs to associate a builder with a director, launch the construction with the director, and get the result from the builder.

2. ___Applicability___
    * Use the Builder pattern to get rid of a "complex constructor".
      The Builder pattern lets you build objects step by step, using only those steps that you really need.
      After implementing the pattern, you don't have to cram dozens of parameters into your constructors anymore.
    * Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
      The Builder pattern can be applied when construction of various representations of the product involves similar steps that differ only in the details.

3. ___Pros___
    * You can construct objects step-by-step, defer construction steps or run steps recursively.
    * You can reuse the same construction code when building various representations of products.
    * Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.

4. ___Cons___
    * The overall complexity of the code increases since the pattern requires creating multiple new classes.

5. ___Usage of the pattern in Java___
    * java.lang.StringBuilder#append() (unsynchronized)
    * java.lang.StringBuffer#append() (synchronized)
    * java.nio.ByteBuffer#put() (also in CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer and DoubleBuffer)

> _Identification:_ The Builder pattern can be recognized in a class, which has a single creation method and several methods to configure the resulting object. Builder methods often support chaining (for example, someBuilder->setValueA(1)->setValueB(2)->create()).