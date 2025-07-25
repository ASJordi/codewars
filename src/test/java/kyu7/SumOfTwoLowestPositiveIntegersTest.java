package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoLowestPositiveIntegersTest {

    @Test
    public void sampleTests() {
        assertEquals(13L, SumOfTwoLowestPositiveIntegers.sumTwoSmallestNumbers(new long []{ 5,  8, 12, 19, 22}), "numbers = [5, 8, 12, 19, 22]");
        assertEquals(6L, SumOfTwoLowestPositiveIntegers.sumTwoSmallestNumbers(new long []{15, 28,  4,  2, 43}), "numbers = [15, 28, 4, 2, 43]");
        assertEquals(6L, SumOfTwoLowestPositiveIntegers.sumTwoSmallestNumbers(new long []{ 3, 87,  3, 12,  7}), "numbers = [3, 87, 3, 12, 7]");
        assertEquals(24L, SumOfTwoLowestPositiveIntegers.sumTwoSmallestNumbers(new long []{23, 71, 33, 82,  1}), "numbers = [23, 71, 33, 82, 1]");
        assertEquals(16L, SumOfTwoLowestPositiveIntegers.sumTwoSmallestNumbers(new long []{52, 76, 14, 12,  4}), "numbers = [52, 76, 14, 12, 4]");
    }

}
