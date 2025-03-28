package kyu7;

public class DifferenceOfSquares {

    public static int differenceOfSquares(int n) {
        int sum = 0;
        int sumOfSquares = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            sumOfSquares += i * i;
        }

        return (sum * sum) - sumOfSquares;
    }

}
