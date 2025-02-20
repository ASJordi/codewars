package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryCalculatorTest {

    @Test
    void test_1() {
        assertEquals("10", BinaryCalculator.calculate("1", "1", "add"));
    }

    @Test
    void test_2() {
        assertEquals("0", BinaryCalculator.calculate("1", "1", "subtract"));
    }

    @Test
    void test_3() {
        assertEquals("1", BinaryCalculator.calculate("1", "1", "multiply"));
    }

    @Test
    void test_4() {
        assertEquals("0", BinaryCalculator.calculate("1", "0", "multiply"));
    }

}
