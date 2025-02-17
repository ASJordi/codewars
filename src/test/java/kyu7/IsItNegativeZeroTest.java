package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsItNegativeZeroTest {

    private final IsItNegativeZero solution = new IsItNegativeZero();

    @Test
    public void basic_tests() throws Exception {
        assertTrue(IsItNegativeZero.isNegativeZero(-0f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(-5f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(-4f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(-3f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(-2f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(-1f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(0f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(1f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(2f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(3f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(4f), "");
        assertFalse(IsItNegativeZero.isNegativeZero(5f), "");
    }

}
