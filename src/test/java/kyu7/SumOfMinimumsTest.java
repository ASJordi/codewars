package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfMinimumsTest {

    private static void doTest(int[][] arr, int expected) {
        assertEquals(expected, SumOfMinimums.sumOfMinimums(arr), "Incorrect answer for arr: " + Arrays.deepToString(arr) + "\n\n");
    }

    @Test
    @DisplayName("Sample Tests")
    void sampleTests() {
        doTest(new int[][]{{7, 9, 8, 6, 2}, {6, 3, 5, 4, 3}, {5, 8, 7, 4, 5}}, 9);
        doTest(new int[][]{{11, 12, 14, 54}, {67, 89, 90, 56}, {7, 9, 4, 3}, {9, 8, 6, 7}}, 76);
    }


}
