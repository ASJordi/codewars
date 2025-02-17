package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexpBasicsIsItAVowelTest {

    @Test
    public void fixedTests() {
        assertFalse(RegexpBasicsIsItAVowel.isVowel(""));
        assertTrue(RegexpBasicsIsItAVowel.isVowel("a"));
        assertTrue(RegexpBasicsIsItAVowel.isVowel("E"));
        assertFalse(RegexpBasicsIsItAVowel.isVowel("ou"));
        assertFalse(RegexpBasicsIsItAVowel.isVowel("z"));
        assertFalse(RegexpBasicsIsItAVowel.isVowel("lol"));
    }

}
