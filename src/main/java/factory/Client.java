package factory;

public class Client {

    public static void main(String[] args) {

        IceCreamFactory iceCreamFactory =  new IceCreamFactory();

        IceCream choco = iceCreamFactory.createIceCream("chocolate");
        IceCream strawberry = iceCreamFactory.createIceCream("strawberry");

        System.out.printf("Chocolate icecream :\n name - %s\n calories - %d\n cost - %d\n",choco.getIceCreamName(),choco.getCalories(),choco.getCost());
        System.out.printf("Strawberry icecream :\n name - %s\n calories - %d\n cost - %d\n",strawberry.getIceCreamName(),strawberry.getCalories(),strawberry.getCost());
    }
}
