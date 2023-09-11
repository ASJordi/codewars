package kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class CompareWithinMarginTest {

    private static final Random random = new Random();

    @Test
    public void exampleTestCases() {
        assertEquals(-1, CompareWithinMargin.closeCompare(4, 5));
        assertEquals(0, CompareWithinMargin.closeCompare(5, 5));
        assertEquals(1, CompareWithinMargin.closeCompare(6, 5));
        assertEquals(-1, CompareWithinMargin.closeCompare(-6, -5));

        assertEquals(0, CompareWithinMargin.closeCompare(2, 5, 3));
        assertEquals(1, CompareWithinMargin.closeCompare(8.1, 5, 3));
        assertEquals(-1, CompareWithinMargin.closeCompare(1.99, 5, 3));
    }

    @Test
    public void noMargin() {
        assertEquals(-1, CompareWithinMargin.closeCompare(4, 5));
        assertEquals(0, CompareWithinMargin.closeCompare(5, 5));
        assertEquals(1, CompareWithinMargin.closeCompare(6, 5));

        assertEquals("a & b may be < 0", -1, CompareWithinMargin.closeCompare(-4, -3));
        assertEquals("a & b may be < 0", 0, CompareWithinMargin.closeCompare(-5, -5));
        assertEquals("a & b may be < 0", 1, CompareWithinMargin.closeCompare(-5, -6));
    }

    @Test
    public void withMarginOf3() {
        assertEquals(0, CompareWithinMargin.closeCompare(2, 5, 3));
        assertEquals(0, CompareWithinMargin.closeCompare(5, 5, 3));
        assertEquals(0, CompareWithinMargin.closeCompare(8, 5, 3));
        assertEquals(1, CompareWithinMargin.closeCompare(8.1, 5, 3));
        assertEquals(-1, CompareWithinMargin.closeCompare(1.99, 5, 3));
    }

    @Test
    public void randomTests() {
        for (int i = 0; i < 100; i++) {
            double a = rnd(-1e4, 2e4);
            double b = rnd(-1e4, 2e4);
            double m = rnd(0, 1e4);
            int sol = sol(a, b, m);
            assertEquals(String.format("compare : %f & %f, margin : %f", a, b, m), sol, CompareWithinMargin.closeCompare(a, b, m));
        }
    }

    public int sol(double a, double b, double margin) {
        return Math.abs(a - b) <= margin ? 0 : (a < b) ? -1 : 1;
    }

    public double rnd(double a, double b) {
        return a + random.nextDouble()*b;
    }

}
