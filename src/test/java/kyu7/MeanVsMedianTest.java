package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeanVsMedianTest {

    @Test
    public void test1() {
        assertEquals("same", MeanVsMedian.meanVsMedian(new int[]{1, 1, 1}));
    }

    @Test
    public void test2() {
        assertEquals("mean", MeanVsMedian.meanVsMedian(new int[]{1, 2, 37}));
    }

    @Test
    public void test3() {
        assertEquals("median", MeanVsMedian.meanVsMedian(new int[]{7, 14, -70}));
    }

}
