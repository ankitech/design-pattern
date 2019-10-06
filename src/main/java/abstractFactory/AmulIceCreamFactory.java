package abstractFactory;

import abstractFactory.iceCream.AmulChocolateIceCream;
import abstractFactory.iceCream.AmulStrawberryIceCream;
import abstractFactory.iceCream.IceCream;

public class AmulIceCreamFactory implements AbstractFactory{

    public IceCream createIceCream(String choice){
        if (choice.equals("chocolate")){
            return new AmulChocolateIceCream();
        }else {
            return new AmulStrawberryIceCream();
        }
    }
}
