package kyu7;

public class MaximumMultiple {

    public static int maxMultiple(int divisor, int bound) {
        int max = 1;

        for (int i = 1; i <= bound ; i++) {
            if (i % divisor == 0 && i > max) max = i;
        }

        return max;
    }

}
