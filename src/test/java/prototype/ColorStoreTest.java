package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ColorStoreTest {

    @Test
    void getColor() {

        assertTrue(ColorStore.getColor("blue") instanceof BlueColor);
        assertTrue(ColorStore.getColor("black") instanceof BlackColor);
    }
}