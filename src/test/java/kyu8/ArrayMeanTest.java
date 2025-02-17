package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMeanTest {

    @Test
    public void test1() {
        assertEquals(1,
                ArrayMean.findAverage(new int[]{1}));
    }

    @Test
    public void test2() {
        assertEquals(4,
                ArrayMean.findAverage(new int[]{1, 3, 5, 7}));
    }

}
