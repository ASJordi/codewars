package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PasswordMakerTest {

    @Test
    public void sample() {
        String mix = PasswordMaker.makePassword(16, true, true, true);

        assertEquals(16, mix.length());
        assertTrue(mix.matches("[a-zA-Z0-9]+"));
        assertEquals(mix.length(), mix.chars().distinct().count());

        assertEquals(25, PasswordMaker.makePassword(25, false, true, true).length());

        assertTrue(PasswordMaker.makePassword(5, true, false, false).matches("[A-Z]{5}"));
        assertTrue(PasswordMaker.makePassword(5, false, true, false).matches("[a-z]{5}"));
        assertTrue(PasswordMaker.makePassword(5, false, false, true).matches("[0-9]{5}"));
    }

}
