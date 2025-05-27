package kyu7;

import java.util.Arrays;

public class NthSmallestElement {

    public static int nthSmallest(final int[] arr, final int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }

}
