package kyu8;

import static java.util.stream.IntStream.iterate;

public class FindMultiplesOfANumber {

    public static int[] find(int base, int limit) {
        return iterate(base, n -> n <= limit, n -> n + base).toArray();
    }

}
