package kyu8;

import java.util.Arrays;

public class HowManyStairsWillSuzukiClimbIn20Years {

    public static long stairsIn20(int[][] stairs) {

        long sum = Arrays.stream(stairs)
                .flatMapToInt(Arrays::stream)
                .sum();

        return sum * 20;

    }

}
