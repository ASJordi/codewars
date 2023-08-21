package kyu7;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

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
