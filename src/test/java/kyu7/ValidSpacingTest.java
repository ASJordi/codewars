package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidSpacingTest {

    @Test
    public void fixedTests() {
        assertTrue(ValidSpacing.validSpacing("Hello world"), "'Hello world'");
        assertFalse(ValidSpacing.validSpacing(" Hello world"), "' Hello world'");
        assertFalse(ValidSpacing.validSpacing("Hello  world "), "'Hello  world '");
        assertTrue(ValidSpacing.validSpacing("Hello"), "'Hello'");
        assertTrue(ValidSpacing.validSpacing("Helloworld"), "'Helloworld'");
    }

}
