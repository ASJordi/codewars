package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidSpacingTest {

    @Test
    public void fixedTests() {
        assertTrue ("'Hello world'", ValidSpacing.validSpacing("Hello world"));
        assertFalse("' Hello world'", ValidSpacing.validSpacing(" Hello world"));
        assertFalse("'Hello  world '", ValidSpacing.validSpacing("Hello  world "));
        assertTrue ("'Hello'", ValidSpacing.validSpacing("Hello"));
        assertTrue ("'Helloworld'", ValidSpacing.validSpacing("Helloworld"));
    }

}
