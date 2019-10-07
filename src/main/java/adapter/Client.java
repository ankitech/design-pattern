package adapter;

class Client
{ 
    public static void main(String args[]) 
    { 
        Sparrow sparrow = new Sparrow(); 
        ToyDuck toyDuck = new PlasticToyDuck(); 
  
        // Wrap a bird in a birdAdapter so that it  
        // behaves like toy duck 
        ToyDuck birdAdapter = new BirdAdapter(sparrow); 
  
        System.out.println("Sparrow...");
        System.out.println(sparrow.fly());
        System.out.println(sparrow.makeSound());
  
        System.out.println("ToyDuck...");
        System.out.println(toyDuck.squeak());
  
        // toy duck behaving like a bird  
        System.out.println("BirdAdapter...");
        System.out.println(birdAdapter.squeak());
    } 
} 