package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BirdAdapterTest {

    @Test
    void squeak() {

        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        assertNotEquals(toyDuck.squeak(), birdAdapter.squeak());
    }
}