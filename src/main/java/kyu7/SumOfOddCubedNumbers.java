package kyu7;

import java.util.Arrays;

public class SumOfOddCubedNumbers {

    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr)
                .map(i -> i * i * i)
                .filter(i -> i % 2 != 0)
                .sum();
    }

}
