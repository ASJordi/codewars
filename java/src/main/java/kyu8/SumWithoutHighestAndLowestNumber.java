package kyu8;

import java.util.Arrays;

public class SumWithoutHighestAndLowestNumber {

    public static int sum(int[] numbers) {

        if (numbers == null || numbers.length <= 2) return 0;

        int maxNumber = Arrays.stream(numbers).max().getAsInt();
        int minNumber = Arrays.stream(numbers).min().getAsInt();
        int sum = Arrays.stream(numbers).sum();

        return sum - (maxNumber + minNumber);
    }

}
