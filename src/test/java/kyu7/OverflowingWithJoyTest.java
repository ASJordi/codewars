package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OverflowingWithJoyTest {

    @Test
    public void test00() {
        assertEquals(0, OverflowingWithJoy.multiply(0, 0));
    }

    @Test
    public void test2345() {
        assertEquals(1035, OverflowingWithJoy.multiply(23, 45));
    }

    @Test
    public void test3456() {
        assertEquals(-1904, OverflowingWithJoy.multiply(-34, 56));
    }

    @Test
    public void testMin() {
        assertEquals(Integer.MIN_VALUE, OverflowingWithJoy.multiply(-32768, 65536));
    }

    @Test
    public void testMax() {
        assertEquals(Integer.MAX_VALUE - 1, OverflowingWithJoy.multiply(42966, 49981));
    }

    @Test(expected=ArithmeticException.class)
    public void testOverflowMax() {
        OverflowingWithJoy.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Test(expected=ArithmeticException.class)
    public void testOverflowMin() {
        OverflowingWithJoy.multiply(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test(expected=ArithmeticException.class)
    public void testOverflowMaxMin() {
        OverflowingWithJoy.multiply(Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    @Test(expected=ArithmeticException.class)
    public void testOverflow1() {
        OverflowingWithJoy.multiply(39650, 54161);
    }

    @Test(expected=ArithmeticException.class)
    public void testOverflow2() {
        OverflowingWithJoy.multiply(42967, 49981);
    }

}
