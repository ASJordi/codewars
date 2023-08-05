package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrabbleScoreTest {

    @Test
    public void basicTest() {
        assertEquals("For empty input", 0, ScrabbleScore.scrabbleScore(""));
        assertEquals("For input \"a\"", 1, ScrabbleScore.scrabbleScore("a"));
        assertEquals("For input \"f\"", 4, ScrabbleScore.scrabbleScore("f"));
        assertEquals("For input \"street\"", 6, ScrabbleScore.scrabbleScore("street"));
        assertEquals("For input \" a\"", 1, ScrabbleScore.scrabbleScore(" a"));
        assertEquals("For input \"st re et\"", 6, ScrabbleScore.scrabbleScore("st re et"));
        assertEquals("For input \"quirky\"", 22, ScrabbleScore.scrabbleScore("quirky"));
        assertEquals("For input \"MULTIBILLIONAIRE\"", 20, ScrabbleScore.scrabbleScore("MULTIBILLIONAIRE"));
        assertEquals("For input \"alacrity\"", 13, ScrabbleScore.scrabbleScore("alacrity"));
        assertEquals("For input \"STREET\"", 6, ScrabbleScore.scrabbleScore("STREET"));
    }

}
