package kyu7;

import java.math.BigInteger;

public class MathPow {

    public static BigInteger pow(BigInteger base, BigInteger exponent) {
        return exponent.intValue() < 1 ? BigInteger.valueOf(-1) : base.pow(BigInteger.TWO.pow(exponent.intValue() - 1).intValue());
    }

}
