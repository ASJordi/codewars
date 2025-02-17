package kyu7;

import java.util.HashMap;
import java.util.Map;

public class FindCountOfMostFrequentItemInAnArray {

    public static int mostFrequentItemCount(int[] collection) {
        Map<Integer, Integer> map = new HashMap<>();

        if (collection.length == 0) return 0;

        for (int n : collection) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
    }

}
