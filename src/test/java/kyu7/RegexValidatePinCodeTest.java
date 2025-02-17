package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexValidatePinCodeTest {

    @Test
    public void validPins() {
        assertTrue(RegexValidatePinCode.validatePin("1234"));
        assertTrue(RegexValidatePinCode.validatePin("0000"));
        assertTrue(RegexValidatePinCode.validatePin("1111"));
        assertTrue(RegexValidatePinCode.validatePin("123456"));
        assertTrue(RegexValidatePinCode.validatePin("098765"));
        assertTrue(RegexValidatePinCode.validatePin("000000"));
        assertTrue(RegexValidatePinCode.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertFalse(RegexValidatePinCode.validatePin("a234"));
        assertFalse(RegexValidatePinCode.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertFalse(RegexValidatePinCode.validatePin("1"));
        assertFalse(RegexValidatePinCode.validatePin("12"));
        assertFalse(RegexValidatePinCode.validatePin("123"));
        assertFalse(RegexValidatePinCode.validatePin("12345"));
        assertFalse(RegexValidatePinCode.validatePin("1234567"));
        assertFalse(RegexValidatePinCode.validatePin("-1234"));
        assertFalse(RegexValidatePinCode.validatePin("1.234"));
        assertFalse(RegexValidatePinCode.validatePin("00000000"));
    }

}
