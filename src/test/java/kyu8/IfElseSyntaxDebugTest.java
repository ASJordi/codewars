package kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IfElseSyntaxDebugTest {

    private static void doTest(int health, boolean expected) {
        String     msg = "checkAlive(" + health + ") returned an incorrect answer.\n\n";
        boolean actual = IfElseSyntaxDebug.checkAlive(health);
        if(expected) assertTrue(actual, msg);
        else assertFalse(actual, msg);
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest(5, true);
        doTest(0, false);
    }

}
