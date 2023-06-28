package easy;

import java.util.Arrays;

public class ArrayPlusArray {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        /*
        int sum = 0;

        for (int n : arr1) { sum += n; }

        for (int n : arr2) { sum += n; }

        return sum;
         */

        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();

    }

}
