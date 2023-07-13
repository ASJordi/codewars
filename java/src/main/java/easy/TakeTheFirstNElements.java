package easy;

import java.util.Arrays;

public class TakeTheFirstNElements {

    public static int[] take(int[] arr, int n) {
        return arr.length == 0 ? new int[]{} :
                 n > arr.length ? arr :
                         Arrays.copyOf(arr, n);
    }

}
