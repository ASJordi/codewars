package kyu8;

public class PowersOfTwo {

    public static long[] powersOfTwo(int n) {

        long[] result = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            result[i] = (long) Math.pow(2, i);
        }

        return result;
//        return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();

    }

}
