package kyu8;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class StaticElectrickeryTest {

    @Test
    public void test() {
        assertEquals(123, StaticElectrickery.INST.plus100(23));
    }

    @Test
    public void random() {
        for (int r = 0; r < 100; r++) {
            int rand =(int)(Math.random() * 100) - 50;
            assertEquals(100+rand, StaticElectrickery.INST.plus100(rand));
        }
    }

}
