package abstractFactory.iceCream;

public class DairyQueenStrawberryIceCream implements IceCream {
    @Override
    public String getIceCreamName() {
        return "Dairy Queen Strawberry";
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
