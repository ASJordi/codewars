package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TipCalculatorTest {

    @Test
    public void test1() {
        assertEquals(Integer.valueOf(2), TipCalculator.calculateTip(30d, "poor"));
    }

    @Test
    public void test2() {
        assertEquals(Integer.valueOf(4), TipCalculator.calculateTip(20d, "Excellent"));
    }

    @Test
    public void test3() {
        assertNull(TipCalculator.calculateTip(20d, "hi"));
    }

    @Test
    public void test4() {
        assertEquals(Integer.valueOf(17), TipCalculator.calculateTip(107.65, "GReat"));
    }

}
