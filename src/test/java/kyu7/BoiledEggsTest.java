package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BoiledEggsTest {

    private static void doTest(int num, int expected) {
        assertEquals(expected, BoiledEggs.cookingTime(num), String.format("Incorrect answer for eggs = %d\n\n", num));
    }

    @Test
    @DisplayName("Sample Tests")
    void sampleTests() {
        doTest(0, 0);
        doTest(5, 5);
        doTest(10, 10);
    }

}
