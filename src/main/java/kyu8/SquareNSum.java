package kyu8;

public class SquareNSum {

    public static int squareSum(int[] n) {

        int res = 0;

        for (int num : n) {
            res += num * num;
        }

        return res;

    }

}
