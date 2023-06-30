package easy;

import java.util.ArrayList;

public class LostWithoutAMap {

    public static int[] map(int[] arr) {

        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = arr[i] * 2;
        }

        return numbers;
        // return Arrays.stream(arr).map(x -> x*2).toArray();
    }

}
