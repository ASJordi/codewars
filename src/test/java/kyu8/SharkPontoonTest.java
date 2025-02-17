package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SharkPontoonTest {

    @Test
    public void testSomething() {
        assertEquals("Alive!", SharkPontoon.shark(12, 50, 4, 8, true));
        assertEquals("Alive!", SharkPontoon.shark(7, 55, 4, 16, true));
        assertEquals("Shark Bait!", SharkPontoon.shark(24, 0, 4, 8, true));
    }

}
