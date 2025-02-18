package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheNthOccurrenceOfAWordInAStringTest {

    @Test
    void sample() {
        String string = "This is an example. Return the nth occurrence of example in this example string.";
        assertEquals(11, FindTheNthOccurrenceOfAWordInAString.findNthOccurrence("example", string, 1));
        assertEquals(49, FindTheNthOccurrenceOfAWordInAString.findNthOccurrence("example", string, 2));
        assertEquals(65, FindTheNthOccurrenceOfAWordInAString.findNthOccurrence("example", string, 3));
        assertEquals(-1, FindTheNthOccurrenceOfAWordInAString.findNthOccurrence("example", string, 4));
    }

}
