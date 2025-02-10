package kyu7;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FigurateNumbersPronicNumberTest {
    
    @Test
    public void isPronicTest() {
        assertTrue("0 is a Pronic Number", FigurateNumbersPronicNumber.isPronic(0));
        assertFalse("1 is not a Pronic Number", FigurateNumbersPronicNumber.isPronic(1));
        assertTrue("2 is a Pronic Number", FigurateNumbersPronicNumber.isPronic(2));
        assertFalse("3 is not a Pronic Number", FigurateNumbersPronicNumber.isPronic(3));
        assertFalse("4 is not a Pronic Number", FigurateNumbersPronicNumber.isPronic(4));
        assertFalse("5 is not a Pronic Number", FigurateNumbersPronicNumber.isPronic(5));
        assertTrue("6 is a Pronic Number", FigurateNumbersPronicNumber.isPronic(6));
        assertFalse("-3 is not a Pronic Number", FigurateNumbersPronicNumber.isPronic(-3));
        assertFalse("-27 is not a Pronic Number", FigurateNumbersPronicNumber.isPronic(-27));
    }

}
