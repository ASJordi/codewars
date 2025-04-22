package kyu7;

import java.util.stream.IntStream;

public class HowGreenIsMyValley {

    public static int[] makeValley(int[] arr) {
        var sorted = IntStream.of(arr).sorted().toArray();

        for (var i = 0; i < sorted.length; i++) {
            arr[i % 2 == 0 ? i / 2 : arr.length - 1 - i / 2] = sorted[arr.length - i - 1];
        }

        return arr;
    }

}
