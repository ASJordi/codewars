package kyu7;

import java.util.Arrays;

public class AreTheNumbersInOrder {

    public static boolean isAscOrder(int[] arr) {
        int[] arrAsc = arr.clone();
        Arrays.sort(arrAsc);
        return Arrays.equals(arrAsc, arr);
    }

}
