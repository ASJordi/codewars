package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseANumberTest {

    @Test
    public void reverse() throws Exception {
        assertEquals(321, ReverseANumber.reverse(123));
        assertEquals(1, ReverseANumber.reverse(1000));
        assertEquals(4321234, ReverseANumber.reverse(4321234));
        assertEquals(5, ReverseANumber.reverse(5));
        assertEquals(89898989, ReverseANumber.reverse(98989898));
        assertEquals(-321, ReverseANumber.reverse(-123));
    }

}
