package kyu7;

import java.util.stream.IntStream;

public class SumOfASequence {

    public static int sequenceSum(int start, int end, int step) {
        return IntStream.iterate(start, i -> i <= end, i -> i + step).sum();
    }

}
