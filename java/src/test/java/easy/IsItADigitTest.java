package easy;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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
