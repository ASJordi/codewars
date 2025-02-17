package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GCDSumTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{3, 3}, GCDSum.solve(6, 3));
        assertArrayEquals(new int[]{2, 6}, GCDSum.solve(8, 2));
        assertArrayEquals(new int[]{-1, -1}, GCDSum.solve(10, 3));
        assertArrayEquals(new int[]{4, 8}, GCDSum.solve(12, 4));
        assertArrayEquals(new int[]{-1, -1}, GCDSum.solve(12, 5));
        assertArrayEquals(new int[]{10, 40}, GCDSum.solve(50, 10));
        assertArrayEquals(new int[]{-1, -1}, GCDSum.solve(50, 4));
        assertArrayEquals(new int[]{5, 5}, GCDSum.solve(10, 5));
        assertArrayEquals(new int[]{5, 95}, GCDSum.solve(100, 5));
        assertArrayEquals(new int[]{5, 995}, GCDSum.solve(1000, 5));
    }

}
