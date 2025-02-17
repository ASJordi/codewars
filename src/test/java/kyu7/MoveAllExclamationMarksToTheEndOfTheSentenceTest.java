package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveAllExclamationMarksToTheEndOfTheSentenceTest {

    @Test
    public void basicTest() {
        assertEquals("Hi!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi!"));
        assertEquals("Hi Hi!!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi! Hi!"));
        assertEquals("Hi Hi Hi!!!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi! Hi! Hi!"));
        assertEquals("Hi Hi Hi!!!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi! !Hi Hi!"));
        assertEquals("Hi Hi Hi!!!!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi! Hi!! Hi!"));
    }

}
