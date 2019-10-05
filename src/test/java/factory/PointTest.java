package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void getCartesianPoint() {
        assertEquals(Point.class, Point.Factory.newCartesianPoint(5,6).getClass());
    }
}