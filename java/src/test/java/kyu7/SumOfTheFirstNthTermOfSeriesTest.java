package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumOfTheFirstNthTermOfSeriesTest {

    @Test
    public void test1() {
        assertEquals("1.57", SumOfTheFirstNthTermOfSeries.seriesSum(5));
    }

    @Test
    public void test2() {
        assertEquals("1.77", SumOfTheFirstNthTermOfSeries.seriesSum(9));
    }

    @Test
    public void test3() {
        assertEquals("1.94", SumOfTheFirstNthTermOfSeries.seriesSum(15));
    }

}
