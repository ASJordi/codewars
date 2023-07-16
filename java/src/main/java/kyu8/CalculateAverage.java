package kyu8;

import java.util.Arrays;

public class CalculateAverage {

    public static double find_average(int[] array) {

//        if (array.length == 0) return 0;
//
//        double sum = 0;
//
//        for (int i : array) {
//            sum += i;
//        }
//
//        return sum /= array.length;

        return Arrays.stream(array).average().orElse(0);

    }

}
