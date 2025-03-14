package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CatAndMouseTest {

    private static void doTest(String s, String expected) {
        assertEquals(expected, CatAndMouse.catMouse(s),
                "catMouse(\"" + s + "\") returned an incorrect answer.\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest("C....m", "Escaped!");
        doTest("C..m", "Caught!");
        doTest("C.....m", "Escaped!");
        doTest("C.m", "Caught!");
        doTest("C...m", "Caught!");
        doTest("Cm", "Caught!");
    }

}
