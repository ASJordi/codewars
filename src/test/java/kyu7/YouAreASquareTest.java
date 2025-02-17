package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YouAreASquareTest {

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals(false, YouAreASquare.isSquare(-1), "negative numbers aren't square numbers");
        assertEquals(true, YouAreASquare.isSquare(0), "0 is a square number (0 * 0)");
        assertEquals(false, YouAreASquare.isSquare(3), "3 isn't a square number");
        assertEquals(true, YouAreASquare.isSquare(4), "4 is a square number (2 * 2)");
        assertEquals(true, YouAreASquare.isSquare(25), "25 is a square number (5 * 5)");
        assertEquals(false, YouAreASquare.isSquare(26), "26 isn't a square number");
    }

}
