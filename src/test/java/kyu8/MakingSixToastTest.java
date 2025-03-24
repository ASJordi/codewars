package kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MakingSixToastTest {

    private static void doTest(int num, int expected) {
        assertEquals(expected, MakingSixToast.sixToast(num), "Incorrect answer for num = " + num + "\n\n");
    }

    @Test
    @DisplayName("Sample Tests")
    void sampleTests() {
        doTest(15, 9);
        doTest(6, 0);
        doTest(3, 3);
    }

}
