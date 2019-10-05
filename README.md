# Design Patterns  
## Builder pattern  
Builder pattern aims to “Separate the construction of a complex object from its representation so that the same   
construction process can create different representations.” It is used to construct a complex object step by step   
and the final step will return the object. The process of constructing an object should be generic so that it can   
be used to create different representations of the same object.  
![UML](https://media.geeksforgeeks.org/wp-content/uploads/uml-of-builedr.jpg)
  
 
![Builder pattern class Diagram](https://github.com/ankitech/design-pattern/blob/master/src/main/java/builder/builder-class-diagram.png)  
*UML diagram for the classes in code example*

**For example** : if we want to generate a builder for house **(House Builder)** we House a House builder which can act as a facade for multiple concrete builder classes which can be part of the house builder interface.  
![Builder example](https://github.com/ankitech/design-pattern/blob/master/src/main/java/builder/builder-example.jpg)