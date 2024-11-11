package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConsecutiveLettersTest {

    @Test
    public void basicTests(){
        assertEquals(true, ConsecutiveLetters.solve("abc"));
        assertEquals(false, ConsecutiveLetters.solve("abd"));
        assertEquals(true, ConsecutiveLetters.solve("dabc"));
        assertEquals(false, ConsecutiveLetters.solve("abbc"));
        assertEquals(true, ConsecutiveLetters.solve("v"));
    }

}
