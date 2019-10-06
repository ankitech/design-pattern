package abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FactoryCreatorTest {

    @Test
    void getFactory() {

        FactoryCreator factoryCreator = new FactoryCreator();

        assertTrue(factoryCreator.getFactory("amul") instanceof AmulIceCreamFactory);
        assertTrue(factoryCreator.getFactory("dairyQueen") instanceof DairyQueenCreamFactory);
    }
}