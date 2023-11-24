package kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HowManyConsecutiveNumbersAreNeeded {

    public static int consecutive(final int[] arr) {
        if (arr.length < 2) return 0;
        Arrays.sort(arr);

        return IntStream.rangeClosed(arr[0], arr[arr.length - 1]).toArray().length - arr.length;
    }

}
