package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SumOfMultiplesTest {

    @Test
    public void basicTests() {
        assertEquals(20, SumOfMultiples.sumMul(2, 9));
        assertEquals(30, SumOfMultiples.sumMul(5, 20));
        assertEquals(1860, SumOfMultiples.sumMul(4,123));
        assertEquals(86469, SumOfMultiples.sumMul(123,4567));
    }

    @Test
    public void invalidTests() {
        assertThrows(IllegalArgumentException.class, () -> SumOfMultiples.sumMul(0, 0));
        assertThrows(IllegalArgumentException.class, () -> SumOfMultiples.sumMul(4, -7));
        assertThrows(IllegalArgumentException.class, () -> SumOfMultiples.sumMul(-3, 10));
    }

}
