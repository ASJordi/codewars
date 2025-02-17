package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WheresWallyTest {

    @Test
    public void testNegative() {
        assertEquals(-1, WheresWally.wheresWally(""));
        assertEquals(-1, WheresWally.wheresWally("DWally"));
        assertEquals(-1, WheresWally.wheresWally(".Wally"));
    }

    @Test
    public void testPositive() {
        assertEquals(0, WheresWally.wheresWally("Wally"));
        assertEquals(8, WheresWally.wheresWally("Where's Wally"));
        assertEquals(3, WheresWally.wheresWally("Hi Wally."));
    }

}
