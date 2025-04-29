package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestCommonDivisorBitCountTest {

    @Test
    void doTest() {
        assertEquals(6, GreatestCommonDivisorBitCount.gcdBinary(666666,333111));
        assertEquals(1, GreatestCommonDivisorBitCount.gcdBinary(545034,5));
        assertEquals(0, GreatestCommonDivisorBitCount.gcdBinary(0,0));
        assertEquals(14, GreatestCommonDivisorBitCount.gcdBinary(0,76899299));
        assertEquals(1, GreatestCommonDivisorBitCount.gcdBinary(-124, -16));
    }

}
