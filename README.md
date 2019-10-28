# Design Patterns  
+ Creational
1. [Builder pattern](#1builder-pattern)
2. [Factory pattern](#2factory-pattern)
3. [Abstract Factory pattern](#3abstract-factory-pattern)
4. [Prototype pattern](#4prototype-pattern)
5. [Singleton pattern](#5singleton-pattern)

+ Structural
6. [Adapter pattern](#6adapter-pattern)
7. [Bridge pattern](#7bridge-pattern)
8. [Composite pattern](#8composite-pattern)
9. [Decorator pattern](#9decorator-pattern)
10. [Facade pattern](#10facade-pattern)
11. [Flyweight pattern](#11flyweight-pattern)
12. [Proxy pattern](#12proxy-pattern)

+ Behavioral
13. [Chain of responsibility pattern](#13chain-of-responsibility-pattern)
14. [Command pattern](#14command-pattern)
15. [Interpreter pattern](#15interpreter-pattern)
16. [Iterator pattern](#16iterator-pattern)
17. [Mediator pattern](#17mediator-pattern)
18. [Memento pattern](#18memento-pattern)
19. [Observer pattern](#19observer-pattern)
20. [State pattern](#20state-pattern)
21. [Strategy pattern](#21strategy-pattern)
22. [Template pattern](#22template-pattern)
23. [Visitor pattern](#23visitor-pattern)

## 1.Builder Pattern
**Builder pattern** aims to “Separate the construction of a complex object from its representation so that the same 
construction process can create different representations.” It is used to construct a complex object step by step 
and the final step will return the object. The process of constructing an object should be generic so that it can 
be used to create different representations of the same object.  
![UML](https://media.geeksforgeeks.org/wp-content/uploads/uml-of-builedr.jpg)
  
 
![Builder pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/builder/builder-class-diagram.png)  
UML diagram for the classes in code example: [src.main.java.builder](https://github.com/ankitech/design-pattern/tree/master/src/main/java/builder)

**For example** : if we want to generate a builder for house **(House Builder)** we House a House builder which can act 
as a facade for multiple concrete builder classes which can be part of the house builder interface.  
![Builder example](https://github.com/ankitech/design-pattern/blob/master/src/main/java/builder/builder-example.jpg)

## 2.Factory Pattern
Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we 
need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from 
client program to the factory class.Factory pattern introduces loose coupling between classes which is the most 
important principle one should consider and apply while designing the application architecture. Loose coupling can 
be introduced in application architecture by programming against abstract entities rather than concrete implementations.
![UML](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)

![Factory pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/factory/factory-class-diagram.jpg)  
UML diagram for the classes in code example: [src.main.java.factory](https://github.com/ankitech/design-pattern/tree/master/src/main/java/factory)

## 3.Abstract Factory Pattern
**Abstract Factory design** pattern is one of the _Creational_ pattern. Abstract Factory pattern is almost similar to 
Factory Pattern is considered as another layer of abstraction over factory pattern. Abstract Factory patterns 
work around a **_super-factory_** which creates other factories. Abstract factory pattern implementation provides us a 
framework that allows us to create objects that follow a general pattern. So at runtime, abstract factory is 
coupled with any desired concrete factory which can create objects of desired type.
![UML](https://media.geeksforgeeks.org/wp-content/uploads/AbstractFactoryPattern-2.png)

![Abstract Factory pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/abstractFactory/abstract-factory-class-diagram.png)  
UML diagram for the classes in code example: [src.main.java.abstractFactory](https://github.com/ankitech/design-pattern/tree/master/src/main/java/abstractFactory)

## 4.Prototype Pattern
**Prototype** allows us to hide the complexity of making new instances from the client. The concept is to copy an existing 
object rather than creating a new instance from scratch, something that may include costly operations. The existing 
object acts as a _prototype_ and contains the state of the object. The newly copied object may change same properties 
only if required. This approach saves costly resources and time, especially when the object creation is a heavy process.
The prototype pattern is a _creational_ design pattern. Prototype patterns is required, when object creation is time consuming, 
and costly operation, so we create object with existing object itself. One of the best available way to create object 
from existing objects are `clone()` method. Clone is the simplest approach to implement prototype pattern. However, 
it is your call to decide how to copy existing object based on your business model.
![UML](https://media.geeksforgeeks.org/wp-content/uploads/download-1.png)

![Prototype pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/prototype/prototype-class-diagram.png)  
UML diagram for the classes in code example: [src.main.java.prototype](https://github.com/ankitech/design-pattern/tree/master/src/main/java/prototype)

## 5.Singleton Pattern
The **singleton pattern** is one of the simplest design patterns. Sometimes we need to have only one instance of our class 
for example a single DB connection shared by multiple objects as creating a separate DB connection for every object may 
be costly. Similarly, there can be a single configuration manager or error manager in an application that handles 
all problems instead of creating multiple managers._The singleton pattern is a design pattern that restricts the 
instantiation of a class to one object._

![singleton pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/singleton/singleton-class-diagram.png)  
UML diagram for the classes in code example: [src.main.java.singleton](https://github.com/ankitech/design-pattern/tree/master/src/main/java/singleton)

## 6.Adapter Pattern
The **adapter pattern** convert the interface of a class into another interface clients expect. Adapter lets 
classes work together that couldn’t otherwise because of incompatible interfaces. The client sees only the target 
interface and not the adapter. The adapter implements the target interface. Adapter delegates all requests to Adaptee.
For example consider a USB to Ethernet adapter. We need this when we have an Ethernet interface on one end and 
USB on the other. Since they are incompatible with each other. we use an adapter that converts one to other.
![UML](https://media.geeksforgeeks.org/wp-content/uploads/classDiagram.jpg)

![Adapter pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/adapter/adapter-class-diagram.png)  
UML diagram for the classes in code example: [src.main.java.adapter](https://github.com/ankitech/design-pattern/tree/master/src/main/java/adapter)

## 7.Bridge Pattern
The Bridge design pattern allows you to separate the abstraction from the implementation.It is a structural design pattern.
There are 2 parts in Bridge design pattern :
- Abstraction
- Implementation

This is a design mechanism that encapsulates an implementation class inside of an interface class.

- The bridge pattern allows the Abstraction and the Implementation to be developed independently and the client code 
can access only the Abstraction part without being concerned about the Implementation part.
- The abstraction is an interface or abstract class and the implementor is also an interface or abstract class.
- The abstraction contains a reference to the implementor. Children of the abstraction are referred to as refined 
bstractions, and children of the implementor are concrete implementors. Since we can change the reference to the implementor 
in the abstraction, we are able to change the abstraction’s implementor at run-time. Changes to the implementor do not affect client code.
- It increases the loose coupling between class abstraction and it’s implementation.
![UML](https://media.geeksforgeeks.org/wp-content/uploads/Bridge_Design.png)

![Bridge pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/bridge/bridge-class-diagram.png)  
UML diagram for the classes in code example: [src.main.java.bridge](https://github.com/ankitech/design-pattern/tree/master/src/main/java/bridge)

## 8.Composite Pattern
_Composite pattern_ is a partitioning design pattern and describes a group of objects that is treated the same way as 
a single instance of the same type of object. The intent of a composite is to “compose” objects into tree structures 
to represent part-whole hierarchies. It allows you to have a tree structure and ask each node in the tree structure to perform a task.

As described by Gof, **_“Compose objects into tree structure to represent part-whole hierarchies. Composite lets 
client treat individual objects and compositions of objects uniformly”_**.
When dealing with Tree-structured data, programmers often have to discriminate between a leaf-node and a branch. 
This makes code more complex, and therefore, error prone. The solution is an interface that allows treating complex 
nd primitive objects uniformly.
In object-oriented programming, a composite is an object designed as a composition of one-or-more similar objects, 
all exhibiting similar functionality. This is known as a “has-a” relationship between objects.
The key concept is that you can manipulate a single instance of the object just as you would manipulate a group of them. 
The operations you can perform on all the composite objects often have a least common denominator relationship.

![Composite pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/composite/composite-class-diagram.png)  
UML diagram for the classes in code example: [src.main.java.composite](https://github.com/ankitech/design-pattern/tree/master/src/main/java/composite)

## 9.Decorator Pattern
_Decorator pattern_ allows a user to add new functionality to an existing object without altering its structure. 
This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
This pattern creates a decorator class which wraps the original class and provides additional functionality keeping 
class methods signature intact.
We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some 
color without alter shape class.

![Decorator pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/decorator/decorator-class-diagram.png)  
UML diagram for the classes in code example: [src.main.java.decorator](https://github.com/ankitech/design-pattern/tree/master/src/main/java/decorator)

## 10.Facade Pattern

## 11.Flyweight Pattern

## 12.Proxy Pattern

## 13.Chain Of Responsibility Pattern

## 14.Command Pattern

## 15.Interpreter Pattern

## 16.Iterator Pattern

## 17.Mediator Pattern

## 18.Memento Pattern

## 19.Observer Pattern

## 20.State Pattern

## 21.Strategy Pattern

## 22.Template Pattern

## 23.Visitor Pattern
