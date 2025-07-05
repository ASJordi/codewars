package kyu7;

import java.util.Arrays;

public class SumOfMinimums {

    public static int sumOfMinimums(int[][] arr){
        int sum = 0;

        for (var a : arr) sum += Arrays.stream(a).min().getAsInt();

        return sum;
    }

}
