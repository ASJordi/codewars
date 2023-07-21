package kyu8;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class WilsonPrime {

    public static boolean am_i_wilson(long n) {
        if (1 == n || 0 == n) {
            return false;
        }

        return LongStream.range(2, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, (a, b) -> a.multiply(b))
                .add(BigInteger.ONE)
                .divideAndRemainder(BigInteger.valueOf(n * n))[1]
                .intValue() == 0;
//        return n == 5 || n == 13 || n == 563;
    }


}
