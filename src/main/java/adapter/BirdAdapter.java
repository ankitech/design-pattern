package adapter;

class BirdAdapter implements ToyDuck
{ 
    // You need to implement the interface your 
    // client expects to use. 
    Bird bird; 
    public BirdAdapter(Bird bird) 
    { 
        // we need reference to the object we 
        // are adapting 
        this.bird = bird; 
    } 
  
    public String squeak()
    { 
        // translate the methods appropriately 
        return bird.makeSound();
    } 
} 