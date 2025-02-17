package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FigurateNumbersPronicNumberTest {

    @Test
    public void isPronicTest() {
        assertTrue(FigurateNumbersPronicNumber.isPronic(0), "0 is a Pronic Number");
        assertFalse(FigurateNumbersPronicNumber.isPronic(1), "1 is not a Pronic Number");
        assertTrue(FigurateNumbersPronicNumber.isPronic(2), "2 is a Pronic Number");
        assertFalse(FigurateNumbersPronicNumber.isPronic(3), "3 is not a Pronic Number");
        assertFalse(FigurateNumbersPronicNumber.isPronic(4), "4 is not a Pronic Number");
        assertFalse(FigurateNumbersPronicNumber.isPronic(5), "5 is not a Pronic Number");
        assertTrue(FigurateNumbersPronicNumber.isPronic(6), "6 is a Pronic Number");
        assertFalse(FigurateNumbersPronicNumber.isPronic(-3), "-3 is not a Pronic Number");
        assertFalse(FigurateNumbersPronicNumber.isPronic(-27), "-27 is not a Pronic Number");
    }

}
