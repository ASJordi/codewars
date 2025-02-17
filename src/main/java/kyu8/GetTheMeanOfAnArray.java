package kyu8;

import java.util.Arrays;

public class GetTheMeanOfAnArray {

    public static int getAverage(int[] marks) {
        return (int) Arrays.stream(marks).average().getAsDouble();
    }

}
