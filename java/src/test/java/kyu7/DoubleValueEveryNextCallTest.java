package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleValueEveryNextCallTest {

    @Test
    public void basicTests() {
        assertEquals(1, DoubleValueEveryNextCall.getNumber());
        assertEquals(2, DoubleValueEveryNextCall.getNumber());
        assertEquals(4, DoubleValueEveryNextCall.getNumber());
        assertEquals(8, DoubleValueEveryNextCall.getNumber());
        assertEquals(16, DoubleValueEveryNextCall.getNumber());
    }

}
