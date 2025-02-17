package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripleTroubleTest {

    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", TripleTrouble.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", TripleTrouble.tripleTrouble("aa", "bb", "cc"));
        assertEquals("Batman", TripleTrouble.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", TripleTrouble.tripleTrouble("LLh", "euo", "xtr"));
    }

}
