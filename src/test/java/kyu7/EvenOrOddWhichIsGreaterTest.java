package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenOrOddWhichIsGreaterTest {

    private static void doTest(String str, String expected) {
        assertEquals(expected, EvenOrOddWhichIsGreater.evenOrOdd(str),
                "evenOrOdd(\"" + str + "\") returned an incorrect result.\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest("12", "Even is greater than Odd");
        doTest("123", "Odd is greater than Even");
        doTest("112", "Even and Odd are the same");
    }

}
