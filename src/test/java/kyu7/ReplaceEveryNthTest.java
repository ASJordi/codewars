package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceEveryNthTest {

    @Test
    void basicTests() {
        assertEquals("Vader soid: No, I am your fother!", ReplaceEveryNth.replaceNth("Vader said: No, I am your father!", 2, 'a', 'o'));
        assertEquals("Vader said: No, I am your fother!", ReplaceEveryNth.replaceNth("Vader said: No, I am your father!", 4, 'a', 'o'));
        assertEquals("Vader said: No, I am your father!", ReplaceEveryNth.replaceNth("Vader said: No, I am your father!", 6, 'a', 'o'));
        assertEquals("Vader said: No, I am your father!", ReplaceEveryNth.replaceNth("Vader said: No, I am your father!", 0, 'a', 'o'));
        assertEquals("Vader said: No, I am your father!", ReplaceEveryNth.replaceNth("Vader said: No, I am your father!", -2, 'a', 'o'));
        assertEquals("Vader sayd: No, I am your father!", ReplaceEveryNth.replaceNth("Vader said: No, I am your father!", 1, 'i', 'y'));

        assertEquals("Luke cries: Noooooioooooioooo!", ReplaceEveryNth.replaceNth("Luke cries: Noooooooooooooooo!", 6, 'o', 'i'));
    }

}
