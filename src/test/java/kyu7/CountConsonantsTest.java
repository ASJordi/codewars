package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountConsonantsTest {

    @Test
    public void testCase1() {
        assertEquals(0, CountConsonants.getCount(""));
        assertEquals(0, CountConsonants.getCount("aaaaa"));
        assertEquals(2, CountConsonants.getCount("XaeiouX"));
        assertEquals(5, CountConsonants.getCount("Bbbbb"));
        assertEquals(7, CountConsonants.getCount("helLo world"));
        assertEquals(7, CountConsonants.getCount("h^$&^#$&^elLo world"));
        assertEquals(2, CountConsonants.getCount("012345_Cb"));
        assertEquals(0, CountConsonants.getCount("0123456789"));
    }

}
