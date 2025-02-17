package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShorterConcatReverseLongerTest {

    @Test
    public void static1() {
        assertEquals("abcdetsrifabcde", ShorterConcatReverseLonger.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau", ShorterConcatReverseLonger.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi", ShorterConcatReverseLonger.shorterReverseLonger("abcde", "fghi"));
    }

}
