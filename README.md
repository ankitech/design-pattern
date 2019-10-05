# Design Patterns  

* [1. Builder pattern](#1Builder-Pattern)
* [2. Factory pattern](#2Factory-Pattern)
* [3. Abstract Factory pattern](#3Abstract-Factory-Pattern)

## 1.Builder Pattern
Builder pattern aims to “Separate the construction of a complex object from its representation so that the same   
construction process can create different representations.” It is used to construct a complex object step by step   
and the final step will return the object. The process of constructing an object should be generic so that it can   
be used to create different representations of the same object.  
![UML](https://media.geeksforgeeks.org/wp-content/uploads/uml-of-builedr.jpg)
  
 
![Builder pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/builder/builder-class-diagram.png)  
*UML diagram for the classes in code example: [src.main.java.builder](https://github.com/ankitech/design-pattern/tree/master/src/main/java/builder)

**For example** : if we want to generate a builder for house **(House Builder)** we House a House builder which can act as a facade for multiple concrete builder classes which can be part of the house builder interface.  
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