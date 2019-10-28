package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransparentShapeTest {

    @Test
    void info() {
        TransparentShape red90TransparentCircle = new TransparentShape(
                new ColoredShape(
                        new Circle(36), "Red"
                ),90
        );

        assertEquals("This is a Circle of radius 36 and color Red and tranceperancy 90",red90TransparentCircle.info());
    }
}