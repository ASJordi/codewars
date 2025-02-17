package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceOfMangoesTest {

    private static void doTest(int q, int p, int expected) {
        assertEquals(expected, PriceOfMangoes.mango(q, p), String.format("Incorrect answer for quantity = %d, price = %d", q, p));
    }

    @Test
    public void sampleTests() {
        doTest(3, 3, 6);
        doTest(9, 5, 30);
    }

}
