package kyu7;

import java.util.Arrays;

public class SumOfTwoLowestPositiveIntegers {

    public static long sumTwoSmallestNumbers(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];
    }

}
