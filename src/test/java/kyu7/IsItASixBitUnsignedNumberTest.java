package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItASixBitUnsignedNumberTest {

    @Test
    void sampleTests() {
        assertEquals(false, IsItASixBitUnsignedNumber.sixBitNumber(""));
        assertEquals(true, IsItASixBitUnsignedNumber.sixBitNumber("0"));
        assertEquals(false, IsItASixBitUnsignedNumber.sixBitNumber("00"));
        assertEquals(true, IsItASixBitUnsignedNumber.sixBitNumber("55"));
        assertEquals(true, IsItASixBitUnsignedNumber.sixBitNumber("63"));
        assertEquals(false, IsItASixBitUnsignedNumber.sixBitNumber("64"));
        assertEquals(false, IsItASixBitUnsignedNumber.sixBitNumber("-0"));
        assertEquals(false, IsItASixBitUnsignedNumber.sixBitNumber("-5"));
        assertEquals(false, IsItASixBitUnsignedNumber.sixBitNumber("05"));
        assertEquals(true, IsItASixBitUnsignedNumber.sixBitNumber("5"));
    }
    
}
