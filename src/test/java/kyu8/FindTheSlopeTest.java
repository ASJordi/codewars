package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSlopeTest {

    @Test
    public void test1() {
        int[] test1 = {19, 3, 20, 3};
        FindTheSlope s = new FindTheSlope();
        assertEquals("0", s.slope(test1));
        assertEquals("undefined", s.slope(new int[]{-7, 2, -7, 4}));
        assertEquals("5", s.slope(new int[]{10, 50, 30, 150}));
        assertEquals("-5", s.slope(new int[]{15, 45, 12, 60}));
        assertEquals("6", s.slope(new int[]{10, 20, 20, 80}));
        assertEquals("undefined", s.slope(new int[]{-10, 6, -10, 3}));
    }

}
