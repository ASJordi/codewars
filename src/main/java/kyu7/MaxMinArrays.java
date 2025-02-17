package kyu7;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinArrays {

    public static int[] solve(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i : arr) nums.add(i);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                int max = Collections.max(nums);
                arr[i] = max;
                nums.remove((Integer) max);
            } else {
                int min = Collections.min(nums);
                arr[i] = min;
                nums.remove((Integer) min);
            }
        }
        return arr;
    }

}
