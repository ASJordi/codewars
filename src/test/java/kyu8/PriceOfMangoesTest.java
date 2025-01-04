package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PriceOfMangoesTest {

    private static void doTest(int q, int p, int expected) {
        assertEquals(String.format("Incorrect answer for quantity = %d, price = %d", q, p), expected, PriceOfMangoes.mango(q, p));
    }

    @Test
    public void sampleTests() {
        doTest(3, 3, 6);
        doTest(9, 5, 30);
    }

}
