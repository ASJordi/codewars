package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ParallelResistorsTest {

    @Test
    void resistanceTest1() {
        assertEquals(10.0, ParallelResistors.resistance(20, 20), 1e-10);
    }

    @Test
    void resistanceTest2() {
        assertEquals(8.0, ParallelResistors.resistance(20, 20, 40), 1e-10);
    }

}
