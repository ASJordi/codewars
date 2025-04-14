package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CyrillicLettersTest {

    @Test
    @DisplayName("Fixed Tests")
    void fixedTests() {
        doTest(true, 'Д');
        doTest(false, 'D');
        doTest(true, 'а');
        doTest(false, 'a');
    }

    void doTest(boolean expected, char letter) {
        assertEquals(expected, CyrillicLetters.isCyrillic(letter), String.format("Incorrect answer for letter = '%c'", letter));
    }

}
