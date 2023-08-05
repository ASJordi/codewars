package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShorterConcatReverseLongerTest {

    @Test
    public void static1() {
        assertEquals("abcdetsrifabcde", ShorterConcatReverseLonger.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau", ShorterConcatReverseLonger.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi", ShorterConcatReverseLonger.shorterReverseLonger("abcde", "fghi"));
    }

}
