package kyu7;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

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
