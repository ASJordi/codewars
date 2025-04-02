package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ElevatorDistanceTest {

    private static void doTest(int[] arr, int expected) {
        assertEquals(expected, ElevatorDistance.elevatorDistance(arr),
                "elevatorDistance(" + Arrays.toString(arr) + ") returned an incorrect answer.\n\n"
        );
    }

    @Test
    @DisplayName("Sample Tests")
    void testSampleCases() {
        doTest(new int[]{5, 2, 8}, 9);
        doTest(new int[]{1, 2, 3}, 2);
        doTest(new int[]{7, 1, 7, 1}, 18);
    }

}
