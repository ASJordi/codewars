package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectiveFearOfnumbersTest {

    @Test
    public void fixedTests() {
        doTest("Monday", 13, false);
        doTest("Sunday", -666, true);
        doTest("Tuesday", 2, false);
        doTest("Tuesday", 965, true);
        doTest("Friday", 2, true);
    }

    private void doTest(final String day, final int num, final boolean expected) {
        assertEquals(expected, SelectiveFearOfnumbers.AmIAfraid(day, num), "Should return " + expected);
    }

}
