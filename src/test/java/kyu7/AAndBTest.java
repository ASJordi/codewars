package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AAndBTest {

    @Test
    public void exampleSumTests() {
        // a + b?
        assertEquals(1, AAndB.testAB(0, 1));
        assertEquals(3, AAndB.testAB(1, 2));
        assertEquals(30, AAndB.testAB(10, 20));
    }

    @Test
    public void exampleProductTests() {
        // a * b?
        assertEquals(1, AAndB.testAB(1, 1));
        assertEquals(3, AAndB.testAB(1, 3));
    }

}
