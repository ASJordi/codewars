package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GrowingPlantTest {

    @Test
    void basicTests() {
        doTest(100, 10, 910, 10);
        doTest( 10,  9,   4,  1);
    }

    private void doTest(int upSpeed, int downSpeed, int desiredHeight, int expected) {
        assertEquals(expected, GrowingPlant.growingPlant(upSpeed, downSpeed, desiredHeight));
    }

}
