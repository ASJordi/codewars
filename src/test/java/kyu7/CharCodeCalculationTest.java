package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CharCodeCalculationTest {

    private static void doTest(String s, int expected) {
        assertEquals(expected, CharCodeCalculation.calc(s),
                "calc(\"" + s + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest("abcdef", 6);
        doTest("ifkhchlhfd", 6);
        doTest("aaaaaddddr", 30);
        doTest("jfmgklf8hglbe", 6);
        doTest("jaam", 12);
        doTest("M", 12);
        doTest("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", 96);
    }

}
