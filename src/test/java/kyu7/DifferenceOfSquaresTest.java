package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferenceOfSquaresTest {


    private static void doTest(int n, int expected) {
        assertEquals(expected, DifferenceOfSquares.differenceOfSquares(n),
                "Incorrect answer for n = " + n + "\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest(5, 170);
        doTest(10, 2640);
        doTest(100, 25164150);
    }

}
