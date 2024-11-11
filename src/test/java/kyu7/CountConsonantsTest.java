package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountConsonantsTest {

    @Test
    public void testCase1() {
        assertEquals("Test string is empty string",0, CountConsonants.getCount(""));
        assertEquals("Test string: \"aaaaa\"",0, CountConsonants.getCount("aaaaa"));
        assertEquals("Test string: \"XaeiouX\"",2, CountConsonants.getCount("XaeiouX"));
        assertEquals("Test string: \"Bbbbb\"",5, CountConsonants.getCount("Bbbbb"));
        assertEquals("Test string: \"helLo world\"",7, CountConsonants.getCount("helLo world"));
        assertEquals("Test string: \"h^$&^#$&^elLo world\"",7, CountConsonants.getCount("h^$&^#$&^elLo world"));
        assertEquals("Test string: \"012345_Cb\"",2, CountConsonants.getCount("012345_Cb"));
        assertEquals("Test string: \"0123456789\"",0, CountConsonants.getCount("0123456789"));
    }

}
