package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOfTwoTest {

    @Test
    public void testPowerOfTwo() {
        assertTrue(PowerOfTwo.isPowerOfTwo(2));
        assertTrue(PowerOfTwo.isPowerOfTwo(4096));
    }

    @Test
    public void testNotPowersOfTwo() {
        assertFalse(PowerOfTwo.isPowerOfTwo(333));
        assertFalse(PowerOfTwo.isPowerOfTwo(0));
    }

}
