package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YouAreASquareTest {

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertFalse(YouAreASquare.isSquare(-1), "negative numbers aren't square numbers");
        assertTrue(YouAreASquare.isSquare(0), "0 is a square number (0 * 0)");
        assertFalse(YouAreASquare.isSquare(3), "3 isn't a square number");
        assertTrue(YouAreASquare.isSquare(4), "4 is a square number (2 * 2)");
        assertTrue(YouAreASquare.isSquare(25), "25 is a square number (5 * 5)");
        assertFalse(YouAreASquare.isSquare(26), "26 isn't a square number");
    }

}
