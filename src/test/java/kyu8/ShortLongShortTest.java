package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortLongShortTest {

    @Test
//    @DisplayName("s1=\"a\", s2=\"bb\"")
    public void test_a_bb() {
        assertEquals("abba", ShortLongShort.solution("a", "bb"));
    }

    @Test
//    @DisplayName("s1=\"aa\", s2=\"b\"")
    public void test_aa_b() {
        assertEquals("baab", ShortLongShort.solution("aa", "b"));
    }

    @Test
//    @DisplayName("s1=\"\", s2=\"aa\"")
    public void test_empty_aa() {
        assertEquals("aa", ShortLongShort.solution("", "aa"));
    }

    @Test
//    @DisplayName("s1=\"bb\", s2=\"\"")
    public void test_bb_empty() {
        assertEquals("bb", ShortLongShort.solution("bb", ""));
    }

}
