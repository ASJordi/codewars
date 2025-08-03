package kyu7;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoOldestAgesTest {

    @Test
    public void shouldSolveSimpleTests() {
        doTest(new int[]{1,5,87,45,8,8}, new int[]{45, 87}, """
        Input:    [1, 5, 87, 45, 8, 8]
        Expected: [45, 87]
        """);
        doTest(new int[]{6,5,83,5,3,18}, new int[]{18, 83}, """
        Input:    [6, 5, 83, 5, 3, 18]
        Expected: [18, 83]
        """);
    }

    private void doTest(int[] ages, int[] expected, String msg) {
        int[] actual = TwoOldestAges.twoOldestAges(ages.clone());
        assertArrayEquals(expected, actual, msg + "Actual:   " + Arrays.toString(actual) + "\n");
    }

}
