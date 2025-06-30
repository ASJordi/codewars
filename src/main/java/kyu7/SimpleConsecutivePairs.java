package kyu7;

import java.util.*;

public class SimpleConsecutivePairs {

    public static int solve(int [] arr) {
        List<int[]> pairs = divideIntoPairs(arr);
        int consecutiveCount = 0;

        for (int[] pair : pairs) {
            if (pair.length == 2 && Math.abs(pair[0] - pair[1]) == 1) consecutiveCount++;
        }

        return consecutiveCount;
    }

    public static List<int[]> divideIntoPairs(int[] arr) {
        List<int[]> pairs = new ArrayList<>();
        int i;

        for (i = 0; i < arr.length - 1; i += 2) {
            pairs.add(new int[]{arr[i], arr[i + 1]});
        }

        if (i < arr.length) pairs.add(new int[]{arr[i]});

        return pairs;
    }

}
