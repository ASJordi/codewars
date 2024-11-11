package kyu7;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class RegexpBasicsIsItALetterTest {

    @Test
    public void fixedTests() {
        assertFalse(RegexpBasicsIsItALetter.isLetter(""));
        assertTrue(RegexpBasicsIsItALetter.isLetter("a"));
        assertTrue(RegexpBasicsIsItALetter.isLetter("X"));
        assertFalse(RegexpBasicsIsItALetter.isLetter("7"));
        assertFalse(RegexpBasicsIsItALetter.isLetter("*"));
        assertFalse(RegexpBasicsIsItALetter.isLetter("ab"));
        assertFalse(RegexpBasicsIsItALetter.isLetter("a\n"));
    }

}
