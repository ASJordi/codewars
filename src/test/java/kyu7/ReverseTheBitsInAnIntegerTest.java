package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseTheBitsInAnIntegerTest {

    @Test
    public void fixedTests() {
        assertEquals(ReverseTheBitsInAnInteger.reverse_bits(417), 267);
        assertEquals(ReverseTheBitsInAnInteger.reverse_bits(267), 417);
        assertEquals(ReverseTheBitsInAnInteger.reverse_bits(0), 0);
        assertEquals(ReverseTheBitsInAnInteger.reverse_bits(2017), 1087);
        assertEquals(ReverseTheBitsInAnInteger.reverse_bits(1023), 1023);
        assertEquals(ReverseTheBitsInAnInteger.reverse_bits(1024), 1);
    }

}
