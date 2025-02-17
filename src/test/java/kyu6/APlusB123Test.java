package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class APlusB123Test {

    private void doIntTest(final int a) {
        final long b = APlusB123.int123(a);
        System.out.println(a + " + " + b + " = " + (int) (a + b));
        Assertions.assertTrue(b >= 0, "B must be >= 0");
        Assertions.assertEquals(123, (int) (a + b), "A + B must give 123");
    }

    @Test
    void testLess() {
        doIntTest(0);
    }

    @Test
    void testSame() {
        doIntTest(123);
    }

    @Test
    void testGreater() {
        doIntTest(500);
    }

}
