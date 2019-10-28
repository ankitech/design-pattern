package decorator;

public class Square implements Shape {

    private String name = "Square";
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "This is a "+this.name +" of side "+this.side;
    }
}
