package kyu7;

public class IsItNegativeZero {

    public static boolean isNegativeZero(float n) {
        int bits = Float.floatToIntBits(n);
        int negativeZeroBits = Float.floatToIntBits(-0.0f);
        return bits == negativeZeroBits;
    }

}
