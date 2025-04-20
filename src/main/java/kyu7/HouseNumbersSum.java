package kyu7;

import java.util.stream.IntStream;

public class HouseNumbersSum {

    public static int houseNumbersSum(final int[] arr) {
        return IntStream.of(arr).takeWhile(n -> n != 0).sum();
    }

}
