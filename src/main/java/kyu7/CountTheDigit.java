package kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountTheDigit {

    public static int nbDig(int n, int d) {
        return IntStream.rangeClosed(0, n)
                .map(i -> i * i)
                .map(i -> (int) Arrays.stream(String.valueOf(i).split(""))
                        .filter(s -> s.equals(String.valueOf(d)))
                        .count())
                .sum();
    }

}
