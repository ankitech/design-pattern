package factory;

public class StrawberryIceCream implements IceCream {
    @Override
    public String getIceCreamName() {
        return "Strawberry";
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
