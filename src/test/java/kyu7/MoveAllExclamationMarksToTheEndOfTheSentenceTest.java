package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveAllExclamationMarksToTheEndOfTheSentenceTest {

    @Test
    public void basicTest() {
        assertEquals(String.format("For input \"%s\"", "Hi!"), "Hi!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi!"));
        assertEquals(String.format("For input \"%s\"", "Hi! Hi!"), "Hi Hi!!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi! Hi!"));
        assertEquals(String.format("For input \"%s\"", "Hi! Hi! Hi!"), "Hi Hi Hi!!!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi! Hi! Hi!"));
        assertEquals(String.format("For input \"%s\"", "Hi! !Hi Hi!"), "Hi Hi Hi!!!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi! !Hi Hi!"));
        assertEquals(String.format("For input \"%s\"", "Hi! Hi!! Hi!"), "Hi Hi Hi!!!!", MoveAllExclamationMarksToTheEndOfTheSentence.remove("Hi! Hi!! Hi!"));
    }

}
