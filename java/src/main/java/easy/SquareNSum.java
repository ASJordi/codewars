package easy;

import java.util.stream.IntStream;

public class SquareNSum {

    public static int squareSum(int[] n) {

        int res = 0;

        for (int num : n) {
            res += num * num;
        }

        return res;

    }

}
