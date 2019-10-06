package abstractFactory;

import abstractFactory.iceCream.DairyQueenChocolateIceCream;
import abstractFactory.iceCream.DairyQueenStrawberryIceCream;
import abstractFactory.iceCream.IceCream;

public class DairyQueenCreamFactory implements AbstractFactory{
    
    public IceCream createIceCream(String choice){
        if (choice.equals("chocolate")){
            return new DairyQueenChocolateIceCream();
        }else {
            return new DairyQueenStrawberryIceCream();
        }
    }
}
