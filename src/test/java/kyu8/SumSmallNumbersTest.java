package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumSmallNumbersTest {

    @Test
    public void testSum() throws Exception {
        byte a = 1;
        byte b = 2;
        assertEquals(3, SumSmallNumbers.sum(a, b));
    }

}
