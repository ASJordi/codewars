package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClosingInSumTest {

    @Test
    @DisplayName("Fixed Basic Tests")
    void testFixedBasic() {
        assertEquals(13, ClosingInSum.closingInSum(121L));
        assertEquals(22, ClosingInSum.closingInSum(1039L));
        assertEquals(100, ClosingInSum.closingInSum(22225555L));
        assertEquals(72, ClosingInSum.closingInSum(2520L));
        assertEquals(331, ClosingInSum.closingInSum(5332824166496569L));
        assertEquals(485, ClosingInSum.closingInSum(1979672314137318116L));
        assertEquals(548, ClosingInSum.closingInSum(1795459644013947776L));
        assertEquals(426, ClosingInSum.closingInSum(2801980378842185820L));
        assertEquals(430, ClosingInSum.closingInSum(3440584288422776554L));
        assertEquals(342, ClosingInSum.closingInSum(1985124000275401986L));
    }
    
}
