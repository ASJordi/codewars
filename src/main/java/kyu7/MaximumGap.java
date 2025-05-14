package kyu7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MaximumGap {

    public static int maxGap(int[] numbers) {
        int max = Integer.MIN_VALUE;
        var list = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i - 1) - list.get(i);
            max = Math.max(max, current);
        }

        return max;
    }

}
