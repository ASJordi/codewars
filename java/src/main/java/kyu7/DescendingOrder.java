package kyu7;

import java.util.*;
public class DescendingOrder {

    public static int sortDesc(final int num) {
        String[] nums = String.valueOf(num).split("");
        Arrays.sort(nums, Comparator.reverseOrder());
        return Integer.parseInt(String.join("", nums));
    }

}
