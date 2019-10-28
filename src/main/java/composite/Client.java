package composite;

public class Client {

    public static void main(String[] args) {

        GraphicObject drawing = new GraphicObject();
        drawing.setName("My Drawing");
        drawing.children.add(new Square("Red"));
        drawing.children.add(new Circle("Green"));

        GraphicObject group = new GraphicObject();
        group.children.add(new Square("Blue"));
        group.children.add(new Circle("Blue"));

        drawing.children.add(group);

        System.out.println(drawing);
    }
}
