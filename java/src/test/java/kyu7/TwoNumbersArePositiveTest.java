package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoNumbersArePositiveTest {

    @Test
    public void sampleTests() {
        assertTrue("(2, 4, -3)", TwoNumbersArePositive.twoArePositive(2, 4, -3));
        assertTrue("(-4, 6, 8)", TwoNumbersArePositive.twoArePositive(-4, 6, 8));
        assertTrue("(4, -6, 9)", TwoNumbersArePositive.twoArePositive(4, -6, 9));
        assertTrue("(4, 6, 0)", TwoNumbersArePositive.twoArePositive(4, 6, 0));
        assertFalse("(-4, 6, 0)", TwoNumbersArePositive.twoArePositive(-4, 6, 0));
        assertFalse("(4, 6, 10)", TwoNumbersArePositive.twoArePositive(4, 6, 10));
        assertFalse("(-14, -3, -4)", TwoNumbersArePositive.twoArePositive(-14, -3, -4));
    }

}
