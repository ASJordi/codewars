package kyu7;

import java.math.BigInteger;

public class ReduceMyFraction {

    public static int[] myFraction(int[] fractions) {
        int gcd = BigInteger.valueOf(fractions[0]).gcd(BigInteger.valueOf(fractions[1])).intValue();
        return new int[]{fractions[0] / gcd, fractions[1] / gcd};
    }

}