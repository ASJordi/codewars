package kyu8;

import java.util.stream.IntStream;

public class GenerateRangeOfIntegers {

    public static int[] generateRange(int min, int max, int step) {
        return IntStream.iterate(min, i -> i <= max, i -> i + step).toArray();
    }

}
