package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrigramsTest {

    @Test
    public void TrigramsShouldWork() {
        assertEquals("the he_ e_q _qu qui uic ick ck_ k_r _re red", Trigrams.trigrams("the quick red"));
    }

    @Test
    public void emptyStringForShortPhrase() {
        assertEquals("", Trigrams.trigrams("no"));
    }

}
