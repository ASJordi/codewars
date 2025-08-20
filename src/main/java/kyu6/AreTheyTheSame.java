package kyu6;

import java.util.*;

public class AreTheyTheSame {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) return false;

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int n : a) {
            int p = n * n;
            countMap.put(p, countMap.getOrDefault(p, 0) + 1);
        }

        for (int p : b) {
            if (!countMap.containsKey(p) || countMap.get(p) == 0) return false;
            countMap.put(p, countMap.get(p) - 1);
        }

        return true;
    }

}
