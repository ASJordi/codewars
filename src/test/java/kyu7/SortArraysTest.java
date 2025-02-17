package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortArraysTest {

    @Test
    public void intArrayTests() {
        int[] ai = {1,2,3};
        int[] uai = {2,3,1};
        assertEquals(ai[0], SortArrays.sortArray(uai)[0]);
        assertEquals(ai[1], SortArrays.sortArray(uai)[1]);
        assertEquals(ai[2], SortArrays.sortArray(uai)[2]);
    }

}
