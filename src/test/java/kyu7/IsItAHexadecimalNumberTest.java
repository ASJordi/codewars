package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsItAHexadecimalNumberTest {

    @Test
    public void fixedTests() {
        assertFalse(IsItAHexadecimalNumber.isHexNumber(""));
        assertFalse(IsItAHexadecimalNumber.isHexNumber("0x"));
        assertTrue(IsItAHexadecimalNumber.isHexNumber("0"));
        assertTrue(IsItAHexadecimalNumber.isHexNumber("0xDEADBEEF"));
        assertTrue(IsItAHexadecimalNumber.isHexNumber("1337bAbe"));
    }

}
