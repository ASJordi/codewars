package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItAEightBitUnsignedNumberTest {

    @Test
    public void sampleTests() {
        assertEquals(false, IsItAEightBitUnsignedNumber.eightBitNumber(""));
        assertEquals(true,  IsItAEightBitUnsignedNumber.eightBitNumber("0"));
        assertEquals(false, IsItAEightBitUnsignedNumber.eightBitNumber("00"));
        assertEquals(true,  IsItAEightBitUnsignedNumber.eightBitNumber("55"));
        assertEquals(false, IsItAEightBitUnsignedNumber.eightBitNumber("042"));
        assertEquals(true,  IsItAEightBitUnsignedNumber.eightBitNumber("123"));
        assertEquals(true,  IsItAEightBitUnsignedNumber.eightBitNumber("255"));
        assertEquals(false, IsItAEightBitUnsignedNumber.eightBitNumber("256"));
        assertEquals(false, IsItAEightBitUnsignedNumber.eightBitNumber("999"));
        assertEquals(false, IsItAEightBitUnsignedNumber.eightBitNumber("-1"));
    }
    
}
