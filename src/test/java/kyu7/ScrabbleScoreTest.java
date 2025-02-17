package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrabbleScoreTest {

    @Test
    public void basicTest() {
        assertEquals(0, ScrabbleScore.scrabbleScore(""));
        assertEquals(1, ScrabbleScore.scrabbleScore("a"));
        assertEquals(4, ScrabbleScore.scrabbleScore("f"));
        assertEquals(6, ScrabbleScore.scrabbleScore("street"));
        assertEquals(1, ScrabbleScore.scrabbleScore(" a"));
        assertEquals(6, ScrabbleScore.scrabbleScore("st re et"));
        assertEquals(22, ScrabbleScore.scrabbleScore("quirky"));
        assertEquals(20, ScrabbleScore.scrabbleScore("MULTIBILLIONAIRE"));
        assertEquals(13, ScrabbleScore.scrabbleScore("alacrity"));
        assertEquals(6, ScrabbleScore.scrabbleScore("STREET"));
    }

}
