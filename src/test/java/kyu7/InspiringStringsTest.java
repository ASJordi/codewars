package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InspiringStringsTest {

    @Test
    public void tests() {
        assertEquals("fgh", InspiringStrings.longestWord("a b c d e fgh"));
        assertEquals("three", InspiringStrings.longestWord("one two three"));
        assertEquals("grey", InspiringStrings.longestWord("red blue grey"));
    }

}
