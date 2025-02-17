package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsItADigitTest {

    @Test
    public void fixedTests() {
        assertFalse(IsItADigit.isDigit(""));
        assertTrue(IsItADigit.isDigit("7"));
        assertFalse(IsItADigit.isDigit(" "));
        assertFalse(IsItADigit.isDigit("a"));
        assertFalse(IsItADigit.isDigit("a5"));
        assertFalse(IsItADigit.isDigit("14"));
    }

}
