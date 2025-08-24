package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BackspacesInStringTest {

    @Test
    void testCleanString() {
        final BackspacesInString bis = new BackspacesInString();
        assertEquals("ac", bis.cleanString("abc#d##c"));
        assertEquals("", bis.cleanString("abc####d##c#"));
        assertEquals("", bis.cleanString("#######"));
        assertEquals("", bis.cleanString(""));
    }

}
