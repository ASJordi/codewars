package kyu6;

import java.math.BigInteger;

public class Array {

    public static int[] upArray(final int[] arr) {
        if (arr == null || arr.length == 0) return null;

        StringBuilder sb = new StringBuilder();

        for (var c : arr) {
            if (c >= 0 && c <= 9) sb.append(c);
            else return null;
        }

        BigInteger num = new BigInteger(sb.toString()).add(BigInteger.ONE);

        var str = num.toString();
        int[] newArr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            newArr[i] = Character.getNumericValue(str.charAt(i));
        }

        return newArr;
    }

}
