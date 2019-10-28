package decorator;

public class Circle implements Shape {

    private String name = "Circle";
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        return "This is a "+this.name +" of radius "+this.radius;
    }
}
