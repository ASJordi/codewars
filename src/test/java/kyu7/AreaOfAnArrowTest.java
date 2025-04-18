package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaOfAnArrowTest {

    private static void doTest(int a, int b, double expected) {
        assertEquals(expected, AreaOfAnArrow.arrowArea(a, b), 1e-10,
                "arrowArea(" + a + ", " + b + ") returned an incorrect answer.\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest(4, 2, 2);
        doTest(7, 6, 10.5);
        doTest(25, 25, 156.25);
    }

}
