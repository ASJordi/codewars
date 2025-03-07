package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AveragesOfNumbersTest {

    @Test
    public void basicTests() {
        assertEquals(Arrays.toString(new double[]{2, 2, 2, 2}), Arrays.toString(AveragesOfNumbers.averages(new int[]{2, 2, 2, 2, 2})));
        assertEquals(Arrays.toString(new double[]{0, 0, 0, 0}), Arrays.toString(AveragesOfNumbers.averages(new int[]{2, -2, 2, -2, 2})));
        assertEquals(Arrays.toString(new double[]{2, 4, 3, -4.5}), Arrays.toString(AveragesOfNumbers.averages(new int[]{1, 3, 5, 1, -10})));
    }

}
