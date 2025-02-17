package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveAllExclamationMarksFromSentenceTest {

    @Test
    public void sampleTests() {
        assertEquals("Hi!", RemoveAllExclamationMarksFromSentence.remove("Hi!"));
        assertEquals("Hi!", RemoveAllExclamationMarksFromSentence.remove("Hi!!!"));
        assertEquals("Hi!", RemoveAllExclamationMarksFromSentence.remove("!Hi"));
        assertEquals("Hi!", RemoveAllExclamationMarksFromSentence.remove("!Hi!"));
        assertEquals("Hi Hi!", RemoveAllExclamationMarksFromSentence.remove("Hi! Hi!"));
        assertEquals("Hi!", RemoveAllExclamationMarksFromSentence.remove("Hi"));
    }

}
