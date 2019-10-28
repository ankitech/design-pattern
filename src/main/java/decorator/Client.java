package decorator;

public class Client {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape blueSquare = new ColoredShape(
                new Square(12),"blue"
        );
        System.out.println(blueSquare.info());

        TransparentShape halfTransparentCircle = new TransparentShape(
                new Circle(40),50
        );
        System.out.println(halfTransparentCircle.info());


        TransparentShape red90TransparentCircle = new TransparentShape(
                new ColoredShape(
                        new Circle(36), "Red"
                ),90
        );

        System.out.println(red90TransparentCircle.info());
    }
}
