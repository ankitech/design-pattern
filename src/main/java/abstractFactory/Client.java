package abstractFactory;

import abstractFactory.iceCream.IceCream;

public class Client {
    public static void main(String[] args) {

        FactoryCreator factoryCreator = new FactoryCreator();

        AbstractFactory amul = factoryCreator.getFactory("amul");
        IceCream choco = amul.createIceCream("chocolate");

        AbstractFactory dairyQueen = factoryCreator.getFactory("dairyQueen");
        IceCream strawberry = dairyQueen.createIceCream("strawberry");

        System.out.printf("Chocolate icecream :\n name - %s\n calories - %d\n cost - %d\n",choco.getIceCreamName(),choco.getCalories(),choco.getCost());
        System.out.printf("Strawberry icecream :\n name - %s\n calories - %d\n cost - %d\n",strawberry.getIceCreamName(),strawberry.getCalories(),strawberry.getCost());
    }
}
