package kyu7;

public class ArraySquareUpB {

    public static int[] squareUp(int n) {
        int[] result = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                result[i * n - j - 1] = j + 1;
            }
        }

        return result;
    }

}
