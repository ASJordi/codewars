package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingleDigitTest {

    @Test
    public void Fixed() {
        assertEquals(5, SingleDigit.singleDigit(5));
        assertEquals(8, SingleDigit.singleDigit(999));
        assertEquals(1, SingleDigit.singleDigit(1234444123));
        assertEquals(2, SingleDigit.singleDigit(443566));
        assertEquals(3, SingleDigit.singleDigit(565656565));
        assertEquals(8, SingleDigit.singleDigit(4868872));
        assertEquals(2, SingleDigit.singleDigit(234234235));
        assertEquals(7, SingleDigit.singleDigit(567448));
        assertEquals(3, SingleDigit.singleDigit(1000000000));
    }

}
