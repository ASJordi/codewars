package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncompleteStringTest {

    @Test
    public void exampleTests1() {
        // return s?
        assertEquals("", IncompleteString.testIncompleteString(""));
        assertEquals("a", IncompleteString.testIncompleteString("a"));
        assertEquals("b", IncompleteString.testIncompleteString("b"));
    }

    @Test
    public void exampleTests2() {
        // return s.substring(0, 1) ?
        assertEquals("a", IncompleteString.testIncompleteString("aa"));
        assertEquals("a", IncompleteString.testIncompleteString("ab"));
        assertEquals("b", IncompleteString.testIncompleteString("bc"));
    }

    @Test
    public void exampleTests3() {
        // return s.substring(0, s.length() / 2) ?
        assertEquals("aa", IncompleteString.testIncompleteString("aaaa"));
        assertEquals("aaa", IncompleteString.testIncompleteString("aaaaaa"));
    }

}
