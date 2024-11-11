package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberOfDecimalDigitsTest {

    @Test
    public void Digits() {
        assertEquals(1,  NumberOfDecimalDigits.Digits(5l));
        assertEquals(5,  NumberOfDecimalDigits.Digits(12345l));
        assertEquals(10, NumberOfDecimalDigits.Digits(9876543210l));
    }

}
