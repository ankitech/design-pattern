package abstractFactory.iceCream;

public class AmulStrawberryIceCream implements IceCream {
    @Override
    public String getIceCreamName() {
        return "Amul Strawberry";
    }

    @Override
    public Integer getCalories() {
        return 150;
    }

    @Override
    public Integer getCost() {
        return 20;
    }
}
