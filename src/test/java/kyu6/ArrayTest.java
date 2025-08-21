package kyu6;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTest {

    @Test
    void exampleTests() {
        doTest(new int[]{2,3,9},   new int[]{2,4,0});
        doTest(new int[]{4,3,2,5}, new int[]{4,3,2,6});
        doTest(new int[]{1,-9},    null);
    }

    private static void doTest(final int[] arr, final int[] expected) {
        String arrAsString = Arrays.toString(arr);
        int[] actual = Array.upArray(arr);
        assertArrayEquals(expected, actual, "Incorrect answer for arr = " + arrAsString);
    }

}
