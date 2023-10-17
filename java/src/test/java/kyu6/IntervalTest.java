package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class IntervalTest {

    @Test
    public void exampleTest() {
        assertArrayEquals(new int[]{2,3,4}, Interval.Interval(new int[] {1,2,3,4,5}, "[2,5)"));
        assertArrayEquals(new int[]{3,4,5}, Interval.Interval(new int[] {1,2,3,4,5}, "(2,5]"));
        assertArrayEquals(new int[]{2,3,4,5}, Interval.Interval(new int[] {1,2,3,4,5}, "[2,5]"));
        assertArrayEquals(new int[]{}, Interval.Interval(new int[] {1,2,3,4,5}, ""));
        assertArrayEquals(new int[]{3,4}, Interval.Interval(new int[] {1,2,3,4,5}, "(2,5)"));
        assertArrayEquals(new int[]{}, Interval.Interval(new int[] {}, "(2,5)"));
    }

}
