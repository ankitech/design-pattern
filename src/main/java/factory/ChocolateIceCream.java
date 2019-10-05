package factory;

public class ChocolateIceCream implements IceCream {

    @Override
    public String getIceCreamName() {
        return "Chocolate";
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
