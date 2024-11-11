package kyu8;

import java.util.Arrays;

public class ArrayMean {

    public static int findAverage(int[] nums) {

//        int sum = Arrays.stream(nums).sum();
//        int avg = (int) (sum / Arrays.stream(nums).count());

        return (int) Arrays.stream(nums).average().getAsDouble();

    }

}
