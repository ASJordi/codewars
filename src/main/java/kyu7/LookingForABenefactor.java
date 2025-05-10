package kyu7;

import java.util.Arrays;

public class LookingForABenefactor {

    public static long newAvg(double[] arr, double navg) {
        var sum = Arrays.stream(arr).sum();
        int n = arr.length;
        long newAvg = (long) Math.ceil((navg * (n + 1) - sum));

        if (newAvg < 0) throw new IllegalArgumentException();

        return newAvg;
    }

}
