package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SingletonTest {

    @Test
    void getInstance() {

        assertTrue(Singleton.getInstance() instanceof Singleton);
    }

    @Test
    void getConnectionCount() {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        instance1.getConnectionCount();
        assertEquals(2,instance2.getConnectionCount());
    }
}