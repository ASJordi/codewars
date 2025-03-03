package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfDecimalDigitsTest {

    @Test
    public void Digits() {
        assertEquals(1, NumberOfDecimalDigits.Digits(5L));
        assertEquals(5, NumberOfDecimalDigits.Digits(12345L));
        assertEquals(10, NumberOfDecimalDigits.Digits(9876543210L));
    }

}
