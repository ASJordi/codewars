package kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UsdCnyTest {

    private static void doTest(int usd, String expected) {
        assertEquals(expected, UsdCny.usdcny(usd), "Incorrect answer for usd = " + usd + "\n\n");
    }

    @Test
    @DisplayName("Sample Tests")
    void sampleTests() {
        doTest(15, "101.25 Chinese Yuan");
        doTest(465, "3138.75 Chinese Yuan");
    }

}
