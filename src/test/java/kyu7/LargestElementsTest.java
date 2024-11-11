package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LargestElementsTest {

    @Test
    public void sampleTestOne() {
        assertArrayEquals("For input: n = 1, arr = [1, 2, 3, 4, 5]", new int[]{5}, LargestElements.largest(1, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void sampleTestTwo() {
        assertArrayEquals("For input: n = 2, arr = [1, 2, 3, 4, 5, 6]", new int[]{5, 6}, LargestElements.largest(2, new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void sampleTestThree() {
        assertArrayEquals("For input: n = 4, arr = [3, 4, 5, 6, 7]", new int[]{4, 5, 6, 7}, LargestElements.largest(4, new int[]{3, 4, 5, 6, 7}));
    }

    @Test
    public void sampleTestFour() {
        assertArrayEquals("For input: n = 3, arr = [1, 2, 1, 1]", new int[]{1, 1, 2}, LargestElements.largest(3, new int[]{1, 2, 1, 1}));
    }

    @Test
    public void sampleTestFive() {
        assertArrayEquals("For input: n = 5, arr = [1, 2, 3, 4, 5]", new int[]{1, 2, 3, 4, 5}, LargestElements.largest(5, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void sampleTestSix() {
        assertArrayEquals("For input: n = 0, arr = [7, 6, 8]", new int[]{}, LargestElements.largest(0, new int[]{7, 6, 8}));
    }

}
