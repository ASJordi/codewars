package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LargestElementsTest {

    @Test
    public void sampleTestOne() {
        assertArrayEquals(new int[]{5}, LargestElements.largest(1, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void sampleTestTwo() {
        assertArrayEquals(new int[]{5, 6}, LargestElements.largest(2, new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void sampleTestThree() {
        assertArrayEquals(new int[]{4, 5, 6, 7}, LargestElements.largest(4, new int[]{3, 4, 5, 6, 7}));
    }

    @Test
    public void sampleTestFour() {
        assertArrayEquals(new int[]{1, 1, 2}, LargestElements.largest(3, new int[]{1, 2, 1, 1}));
    }

    @Test
    public void sampleTestFive() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, LargestElements.largest(5, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void sampleTestSix() {
        assertArrayEquals(new int[]{}, LargestElements.largest(0, new int[]{7, 6, 8}));
    }

}
