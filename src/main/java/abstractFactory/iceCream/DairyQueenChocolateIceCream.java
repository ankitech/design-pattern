package abstractFactory.iceCream;

public class DairyQueenChocolateIceCream implements IceCream {

    @Override
    public String getIceCreamName() {
        return "Dairy Queen Chocolate";
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
