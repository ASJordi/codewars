package kyu7;

import java.util.Arrays;

public class LostNumberInNumberSequence {

    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        int sumArr = Arrays.stream(arr).sum();
        int sumMixed = Arrays.stream(mixedArr).sum();
        return sumArr - sumMixed;
    }

}
