package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceAllVowelToExclamationMarkInTheSentenceTest {

    @Test
    public void basicTests() {
        assertEquals("H!!", ReplaceAllVowelToExclamationMarkInTheSentence.replace("Hi!"));
        assertEquals("!H!! H!!", ReplaceAllVowelToExclamationMarkInTheSentence.replace("!Hi! Hi!"));
        assertEquals("!!!!!", ReplaceAllVowelToExclamationMarkInTheSentence.replace("aeiou"));
        assertEquals("!BCD!", ReplaceAllVowelToExclamationMarkInTheSentence.replace("ABCDE"));
    }

}
