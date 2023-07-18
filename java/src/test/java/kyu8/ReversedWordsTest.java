package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedWordsTest {

    @Test
    public void sampleTests() {
        assertEquals("world! hello", ReversedWords.reverseWords("hello world!"));
        assertEquals("this like speak doesn't yoda", ReversedWords.reverseWords("yoda doesn't speak like this"));
        assertEquals("foobar", ReversedWords.reverseWords("foobar"));
        assertEquals("editor kata", ReversedWords.reverseWords("kata editor"));
        assertEquals("boat your row row row", ReversedWords.reverseWords("row row row your boat"));
        assertEquals("", ReversedWords.reverseWords(""));
    }

}
