package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EvensTimesLastTest {

    private static void doTest(int[] arr, int expected) {
        assertEquals(expected, EvensTimesLast.evenLast(arr),
                "evenLast(" + Arrays.toString(arr) + ") returned an incorrect result.\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest(new int[]{2, 3, 4, 5}, 30);
        doTest(new int[]{}, 0);
        doTest(new int[]{2, 2, 2, 2}, 8);
        doTest(new int[]{1, 3, 3, 1, 10}, 140);
        doTest(new int[]{-11, 3, 3, 1, 10}, 20);
    }

}
