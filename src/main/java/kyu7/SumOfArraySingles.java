package kyu7;

import java.util.HashMap;
import java.util.Map;

public class SumOfArraySingles {

    public static int repeats(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.merge(n, 1, Integer::sum);
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .sum();
    }

}
