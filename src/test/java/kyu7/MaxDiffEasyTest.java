package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxDiffEasyTest {

    @Test
    public void BasicTests() {

        assertEquals(4, MaxDiffEasy.maxDiff(new int[]{1, 2, 3, 4, 5, 5, 4}));
        assertEquals(30, MaxDiffEasy.maxDiff(new int[]{-4, -5, -3, -1, -31}));
        assertEquals(10, MaxDiffEasy.maxDiff(new int[]{1, 2, 3, 4, -5, 5, 4}));
        assertEquals(0, MaxDiffEasy.maxDiff(new int[]{1000000}));
        assertEquals(0, MaxDiffEasy.maxDiff(new int[]{}));
    }

}
