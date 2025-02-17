package kyu6;

import java.math.BigInteger;

public class SumTheNumsSumTheSumsAndSumTheNumsUpToThatSum {

    public static BigInteger sumOfSums(int n) {
        BigInteger num = new BigInteger(n + "");
        return S(Z(num));
    }

    public static BigInteger S(BigInteger num) {
        return num.multiply(num.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
    }

    public static BigInteger Z(BigInteger num) {
        return num.multiply(num.add(BigInteger.valueOf(1L))).multiply(num.add(BigInteger.valueOf(2L))).divide(BigInteger.valueOf(6L));
    }

}
