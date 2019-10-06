package abstractFactory;

import abstractFactory.iceCream.IceCream;

public interface AbstractFactory {
    IceCream createIceCream(String flavor);
}
