package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsecutiveLettersTest {

    @Test
    public void basicTests() {
        assertTrue(ConsecutiveLetters.solve("abc"));
        assertFalse(ConsecutiveLetters.solve("abd"));
        assertTrue(ConsecutiveLetters.solve("dabc"));
        assertFalse(ConsecutiveLetters.solve("abbc"));
        assertTrue(ConsecutiveLetters.solve("v"));
    }

}
