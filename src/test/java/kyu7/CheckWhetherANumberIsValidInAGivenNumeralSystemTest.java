package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckWhetherANumberIsValidInAGivenNumeralSystemTest {

    private void doTest(String num, int base, boolean expected) {
        String messageOnFail = "Test failed for num = " + num + ", base = " + base + "\n\n";

        assertEquals(expected, CheckWhetherANumberIsValidInAGivenNumeralSystem.validateBase(num, base), messageOnFail);
    }

    @Test
    @Order(1)
    @DisplayName("Sample tests")
    void fixedTests() {
        doTest("61262", 8, true);
        doTest("ABCDEF", 16, true);
        doTest("25172", 5, false);
        doTest("EG", 16, false);
        doTest("W", 32, false);
        doTest("99235", 9, false);
        doTest("009", 10, true);
    }

}
