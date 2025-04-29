package kyu7;

public class GreatestCommonDivisorBitCount {

    public static int gcdBinary(int a, int b) {
        if (a == 0 && b == 0) return 0;
        int gcd = gcd(Math.abs(a), Math.abs(b));
        return Integer.bitCount(gcd);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
