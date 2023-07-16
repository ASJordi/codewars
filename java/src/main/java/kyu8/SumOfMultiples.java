package kyu8;

public class SumOfMultiples {

    public static long sumMul(int n, int m) {

        if (n < 1 || m < 1) throw new IllegalArgumentException();

        long sum = 0;
        int c = 1;

        while (n * c < m) {
            sum += (long) n * c;
            c++;
        }

        return sum;

    }

}
