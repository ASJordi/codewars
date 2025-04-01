package kyu7;

import java.math.BigInteger;

public class BinarysXORe {

    public static BigInteger sxore(BigInteger n) {

        if (n.signum() < 0) return BigInteger.ZERO;

        BigInteger mod = n.mod(BigInteger.valueOf(4));

        if (mod.equals(BigInteger.ZERO)) return n;
        else if (mod.equals(BigInteger.ONE)) return BigInteger.ONE;
        else if (mod.equals(BigInteger.valueOf(2))) return n.add(BigInteger.ONE);
        else return BigInteger.ZERO;

    }
}