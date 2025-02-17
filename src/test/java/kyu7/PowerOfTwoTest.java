package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOfTwoTest {

    @Test
    public void testPowerOfTwo() {
        assertEquals(true, PowerOfTwo.isPowerOfTwo(   2));
        assertEquals(true, PowerOfTwo.isPowerOfTwo(4096));
    }

    @Test
    public void testNotPowersOfTwo() {
        assertEquals(false, PowerOfTwo.isPowerOfTwo(333));
        assertEquals(false, PowerOfTwo.isPowerOfTwo(  0));
    }

}
