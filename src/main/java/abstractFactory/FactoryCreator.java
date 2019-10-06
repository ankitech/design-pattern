package abstractFactory;

public class FactoryCreator {

    public AbstractFactory getFactory(String brand){
        if(brand.equals("amul")){
            return new AmulIceCreamFactory();
        }else {
            return new DairyQueenCreamFactory();
        }
    }
}
