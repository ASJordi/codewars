package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
