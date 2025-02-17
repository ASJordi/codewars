package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleValidationOfAUsernameWithRegexTest {

    @Test
    public void basicTests() {
        assertTrue(SimpleValidationOfAUsernameWithRegex.validateUsr("regex"));
        assertFalse(SimpleValidationOfAUsernameWithRegex.validateUsr("a"));
        assertFalse(SimpleValidationOfAUsernameWithRegex.validateUsr("Hass"));
        assertFalse(SimpleValidationOfAUsernameWithRegex.validateUsr("Hasd_12assssssasasasasasaasasasasas"));
        assertFalse(SimpleValidationOfAUsernameWithRegex.validateUsr(""));
        assertTrue(SimpleValidationOfAUsernameWithRegex.validateUsr("____"));
        assertFalse(SimpleValidationOfAUsernameWithRegex.validateUsr("012"));
        assertTrue(SimpleValidationOfAUsernameWithRegex.validateUsr("p1pp1"));
        assertFalse(SimpleValidationOfAUsernameWithRegex.validateUsr("asd43 34"));
        assertTrue(SimpleValidationOfAUsernameWithRegex.validateUsr("asd43_34"));
    }

}
