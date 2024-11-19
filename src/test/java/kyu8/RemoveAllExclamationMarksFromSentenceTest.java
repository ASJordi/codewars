package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveAllExclamationMarksFromSentenceTest {

    @Test
    public void sampleTests() {
        assertEquals("For input \"Hi!\"", "Hi!", RemoveAllExclamationMarksFromSentence.remove("Hi!"));
        assertEquals("For input \"Hi!!!\"", "Hi!", RemoveAllExclamationMarksFromSentence.remove("Hi!!!"));
        assertEquals("For input \"!Hi\"", "Hi!", RemoveAllExclamationMarksFromSentence.remove("!Hi"));
        assertEquals("For input \"!Hi!\"", "Hi!", RemoveAllExclamationMarksFromSentence.remove("!Hi!"));
        assertEquals("For input \"Hi! Hi!\"", "Hi Hi!", RemoveAllExclamationMarksFromSentence.remove("Hi! Hi!"));
        assertEquals("For input \"Hi\"", "Hi!", RemoveAllExclamationMarksFromSentence.remove("Hi"));
    }

}
