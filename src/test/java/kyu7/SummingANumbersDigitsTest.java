package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SummingANumbersDigitsTest {

    private static void doTest(int num, int expected) {
        assertEquals(expected, SummingANumbersDigits.sumDigits(num), String.format("Incorrect answer for num = %d\n\n", num));
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest(10, 1);
        doTest(99, 18);
        doTest(-32, 5);
    }

}
