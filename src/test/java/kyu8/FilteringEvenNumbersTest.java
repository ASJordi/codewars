package kyu8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilteringEvenNumbersTest {

    @Test
    public void firstTest() throws Exception {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(expectedResult, FilteringEvenNumbers.filterOddNumber(listOfNumbers));
    }

    @Test
    public void secondTest() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(FilteringEvenNumbers.filterOddNumber(listOfNumbers).toArray()));
    }


}
