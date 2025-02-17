package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoNumbersArePositiveTest {

    @Test
    public void sampleTests() {
        assertTrue(TwoNumbersArePositive.twoArePositive(2, 4, -3), "(2, 4, -3)");
        assertTrue(TwoNumbersArePositive.twoArePositive(-4, 6, 8), "(-4, 6, 8)");
        assertTrue(TwoNumbersArePositive.twoArePositive(4, -6, 9), "(4, -6, 9)");
        assertTrue(TwoNumbersArePositive.twoArePositive(4, 6, 0), "(4, 6, 0)");
        assertFalse(TwoNumbersArePositive.twoArePositive(-4, 6, 0), "(-4, 6, 0)");
        assertFalse(TwoNumbersArePositive.twoArePositive(4, 6, 10), "(4, 6, 10)");
        assertFalse(TwoNumbersArePositive.twoArePositive(-14, -3, -4), "(-14, -3, -4)");
    }

}
