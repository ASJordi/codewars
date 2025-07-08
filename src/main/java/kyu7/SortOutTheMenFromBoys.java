package kyu7;

import java.util.*;

public class SortOutTheMenFromBoys {

    public static int[] menFromBoys(final int[] values) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int value : values) {
            if (value % 2 == 0) even.add(value);
            else odd.add(value);
        }

        even.sort(Comparator.naturalOrder());
        odd.sort(Comparator.reverseOrder());
        even.addAll(odd);

        return even.stream().distinct().mapToInt(i -> i).toArray();
    }

}
