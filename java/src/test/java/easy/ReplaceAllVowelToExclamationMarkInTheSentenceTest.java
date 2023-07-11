package easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReplaceAllVowelToExclamationMarkInTheSentenceTest {

    @Test
    public void basicTests() {
        assertEquals("H!!", ReplaceAllVowelToExclamationMarkInTheSentence.replace("Hi!"));
        assertEquals("!H!! H!!", ReplaceAllVowelToExclamationMarkInTheSentence.replace("!Hi! Hi!"));
        assertEquals("!!!!!", ReplaceAllVowelToExclamationMarkInTheSentence.replace("aeiou"));
        assertEquals("!BCD!", ReplaceAllVowelToExclamationMarkInTheSentence.replace("ABCDE"));
    }

}
