package prototype;

class Client
{ 
    public static void main (String[] args) 
    { 
        ColorStore.getColor("blue").addColor(); 
        ColorStore.getColor("black").addColor(); 
        ColorStore.getColor("black").addColor(); 
        ColorStore.getColor("blue").addColor(); 
    } 
}