package easy;

import java.util.stream.IntStream;

public class CountTheMonkeys {

    public static int[] monkeyCount(final int n){

//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = i + 1;
//        }
//
//        return arr;
        return IntStream.rangeClosed(1, n).toArray();
    }

}
