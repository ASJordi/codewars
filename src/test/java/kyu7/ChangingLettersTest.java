package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangingLettersTest {

    @Test
    public void swap_1() {
        assertEquals("HEllOWOrld!", ChangingLetters.swap("HelloWorld!"));
    }

    @Test
    public void swap_2() {
        assertEquals("SUndAy", ChangingLetters.swap("Sunday"));
    }

}
