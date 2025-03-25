package kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTheStringsTest {

    private static void doTest(String a, String b, String expected) {
        assertEquals(expected, SumTheStrings.sumStr(a, b),
                "sumStr(\"" + a + "\", \"" + b + "\") returned an incorrect result.\n\n");
    }

    @Test
    @DisplayName("Sample Tests")
    void sampleTests() {
        doTest("4", "5", "9");
        doTest("34", "5", "39");
        doTest("", "8", "8");
        doTest("9", "", "9");
        doTest("", "", "0");
    }

}
