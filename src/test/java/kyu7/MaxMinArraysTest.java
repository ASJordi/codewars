package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaxMinArraysTest {

    @Test
    public void basicTests(){
        assertArrayEquals(new int[]{15,7,12,10,11}, MaxMinArrays.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11}, MaxMinArrays.solve(new int[]{15,11,10,7,12}));
        assertArrayEquals(new int[]{15,7,12,10,11}, MaxMinArrays.solve(new int[]{15,11,10,7,12}));
    }

}
