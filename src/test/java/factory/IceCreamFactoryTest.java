package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IceCreamFactoryTest {

    @Test
    void createIceCream() {
        IceCreamFactory iceCreamFactory = new IceCreamFactory();
        assertTrue(iceCreamFactory.createIceCream("chocolate") instanceof ChocolateIceCream);
        assertTrue(iceCreamFactory.createIceCream("strawberry") instanceof StrawberryIceCream);
    }
}