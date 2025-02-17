package kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfOddNumbers {

    public static int rowSumOddNumbers(int n) {

        int[] nums = IntStream.rangeClosed(1, n).toArray();
        int sum = Arrays.stream(nums).sum();
        int start = sum - n;
        int sumOdd = 0;

        for (int i = start + 1; i <= sum; i++) {
            sumOdd += nthOdd(i);
        }

        return sumOdd;
//        return n * n * n;

    }

    public static int nthOdd(int n) {
        return (2 * n - 1);
    }

}
