package kyu7;

import java.util.Arrays;

public class MeanVsMedian {

    public static String meanVsMedian(int[] numbers) {
        double mean = Arrays.stream(numbers).average().getAsDouble();
        Arrays.sort(numbers);
        int median = numbers[(numbers.length / 2)];
        return mean == median ? "same" :
                mean > median ? "mean" : "median";
    }

}
