package abstractFactory.iceCream;

public class AmulChocolateIceCream implements IceCream {

    @Override
    public String getIceCreamName() {
        return "Amul Chocolate";
    }

    @Override
    public Integer getCalories() {
        return 200;
    }

    @Override
    public Integer getCost() {
        return 30;
    }
}
