package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveNExclamationMarksInTheSentenceFromLeftToRightTest {

    @Test
    public void fixedTests() {
        // assertEquals("expected", "actual");
        assertEquals("Hi", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("Hi!", 1));
        assertEquals("Hi", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("Hi!", 100));
        assertEquals("Hi!!", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("Hi!!!", 1));
        assertEquals("Hi", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("Hi!!!", 100));
        assertEquals("Hi", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("!Hi", 1));
        assertEquals("Hi!", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("!Hi!", 1));
        assertEquals("Hi", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", RemoveNExclamationMarksInTheSentenceFromLeftToRight.remove("!!!Hi !!hi!!! !hi", 100));
    }

}
