# Design Patterns  

* [1. Builder pattern](#1Builder-Pattern)
* [2. Factory pattern](#2Factory-Pattern)
* [3. Abstract Factory pattern](#3Abstract-Factory-Pattern)
* [4. Prototype pattern](#4Prototype-Pattern)
* [5. Singleton pattern](#5Singleton-Pattern)

## 1.Builder Pattern
Builder pattern aims to “Separate the construction of a complex object from its representation so that the same   
construction process can create different representations.” It is used to construct a complex object step by step   
and the final step will return the object. The process of constructing an object should be generic so that it can   
be used to create different representations of the same object.  
![UML](https://media.geeksforgeeks.org/wp-content/uploads/uml-of-builedr.jpg)
  
 
![Builder pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/builder/builder-class-diagram.png)  
*UML diagram for the classes in code example: [src.main.java.builder](https://github.com/ankitech/design-pattern/tree/master/src/main/java/builder)

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
*UML diagram for the classes in code example: [src.main.java.factory](https://github.com/ankitech/design-pattern/tree/master/src/main/java/factory)

## 3.Abstract Factory Pattern
**Abstract Factory design** pattern is one of the _Creational_ pattern. Abstract Factory pattern is almost similar to 
Factory Pattern is considered as another layer of abstraction over factory pattern. Abstract Factory patterns 
work around a **_super-factory_** which creates other factories. Abstract factory pattern implementation provides us a 
framework that allows us to create objects that follow a general pattern. So at runtime, abstract factory is 
coupled with any desired concrete factory which can create objects of desired type.
![UML](https://media.geeksforgeeks.org/wp-content/uploads/AbstractFactoryPattern-2.png)

![Abstract Factory pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/abstractFactory/abstract-factory-class-diagram.png)  
*UML diagram for the classes in code example: [src.main.java.abstractFactory](https://github.com/ankitech/design-pattern/tree/master/src/main/java/abstractFactory)

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
*UML diagram for the classes in code example: [src.main.java.prototype](https://github.com/ankitech/design-pattern/tree/master/src/main/java/prototype)

## 5.Singleton Pattern