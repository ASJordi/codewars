package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergingSortedIntegerArraysTest {

    @Test
    public void basicTest() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, MergingSortedIntegerArrays.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, MergingSortedIntegerArrays.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }

}
