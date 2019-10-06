package prototype;

class BlackColor extends Color{
   
    public BlackColor()
    { 
        this.colorName = "black"; 
    } 
   
    @Override
    void addColor()  
    { 
        System.out.println("Black color added"); 
    } 
} 