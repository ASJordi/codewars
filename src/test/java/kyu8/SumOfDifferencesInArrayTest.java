package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDifferencesInArrayTest {

    @Test
    public void arrayIsEmpty() {
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[0]));
    }

    @Test
    public void arrayHasOnlyOneItem() {
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[]{0}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[]{-1}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[]{1}));
    }

    @Test
    public void arrayHasMultipleItems() {
        assertEquals(9, SumOfDifferencesInArray.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferencesInArray.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferencesInArray.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferencesInArray.sumOfDifferences(new int[]{-17, 17}));
    }
}
