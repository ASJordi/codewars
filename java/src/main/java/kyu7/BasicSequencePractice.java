package kyu7;

import java.util.stream.IntStream;

public class BasicSequencePractice {

    public static int[] sumOfN(int n) {
        int[] numbers = new int[Math.abs(n) + 1];
        int sign = (int) Math.signum(n);

        for (int i = 0; i < Math.abs(n) + 1; i++) numbers[i] = IntStream.rangeClosed(0, i).sum() * sign;

        return numbers;
    }

}
