package factory;

public class IceCreamFactory {
    public IceCream createIceCream(String choice){
        if (choice.equals("chocolate")){
            return new ChocolateIceCream();
        }else {
            return new StrawberryIceCream();
        }
    }
}
