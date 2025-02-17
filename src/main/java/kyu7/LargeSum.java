package kyu7;

import java.math.BigInteger;

public class LargeSum {

    public static String firstTenDigitsOfSum(String[] numbers) {
        BigInteger sum = BigInteger.ZERO;

        for (String num : numbers) {
            sum = sum.add(new BigInteger(num));
        }

        return sum.toString(10).substring(0, 10);
    }

}
