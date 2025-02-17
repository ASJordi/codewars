package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortOnceTest {

    @Test
    public void testBubbleSortOnce() {
        int[] actual = BubbleSortOnce.bubbleSortOnce(new int[]{9, 7, 5, 3, 1, 2, 4, 6, 8});
        assertArrayEquals(
                new int[]{7, 5, 3, 1, 2, 4, 6, 8, 9},
                actual,
                """
                        Input:    [9, 7, 5, 3, 1, 2, 4, 6, 8]
                        Expected: [7, 5, 3, 1, 2, 4, 6, 8, 9]
                        Actual:   %s
                        """.formatted(Arrays.toString(actual))
        );
    }

}
