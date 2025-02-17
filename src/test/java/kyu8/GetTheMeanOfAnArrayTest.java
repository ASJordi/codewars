package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTheMeanOfAnArrayTest {

    @Test
    public void simpleTest() {
        assertEquals(2, GetTheMeanOfAnArray.getAverage(new int[]{2, 2, 2, 2}));
        assertEquals(3, GetTheMeanOfAnArray.getAverage(new int[]{1, 2, 3, 4, 5}));
        assertEquals(1, GetTheMeanOfAnArray.getAverage(new int[]{1, 1, 1, 1, 1, 1, 1, 2}));
    }

}
