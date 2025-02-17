package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsItAEightBitSignedNumberTest {

    @Test
    public void fixedTests() {
        assertFalse(IsItAEightBitSignedNumber.isSignedEightBitNumber(""));
        assertTrue(IsItAEightBitSignedNumber.isSignedEightBitNumber("0"));
        assertFalse(IsItAEightBitSignedNumber.isSignedEightBitNumber("00"));
        assertFalse(IsItAEightBitSignedNumber.isSignedEightBitNumber("-0"));
        assertTrue(IsItAEightBitSignedNumber.isSignedEightBitNumber("55"));
        assertTrue(IsItAEightBitSignedNumber.isSignedEightBitNumber("-23"));
        assertFalse(IsItAEightBitSignedNumber.isSignedEightBitNumber("042"));
        assertTrue(IsItAEightBitSignedNumber.isSignedEightBitNumber("127"));
        assertFalse(IsItAEightBitSignedNumber.isSignedEightBitNumber("128"));
        assertFalse(IsItAEightBitSignedNumber.isSignedEightBitNumber("999"));
        assertTrue(IsItAEightBitSignedNumber.isSignedEightBitNumber("-128"));
        assertFalse(IsItAEightBitSignedNumber.isSignedEightBitNumber("-129"));
        assertFalse(IsItAEightBitSignedNumber.isSignedEightBitNumber("-999"));
    }

}
