package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PaddedNumbersTest {

    private static void doTest(int n, String expected) {
        assertEquals(expected, PaddedNumbers.solution(n), String.format("Incorrect answer for value = %d\n\n", n));
    }

    @Test
    @DisplayName("Sample Tests")
    void sampleTest() {
        doTest(5, "Value is 00005");
        doTest(1204, "Value is 01204");
        doTest(109, "Value is 00109");
        doTest(0, "Value is 00000");
    }

}
