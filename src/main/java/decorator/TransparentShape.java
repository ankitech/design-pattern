package decorator;

public class TransparentShape implements Shape {

    private Shape shape;
    private int transperancy;

    public TransparentShape(Shape shape, int transperancy) {
        this.shape = shape;
        this.transperancy = transperancy;
    }

    @Override
    public String info() {
        return shape.info()+ " and tranceperancy "+this.transperancy;
    }
}
