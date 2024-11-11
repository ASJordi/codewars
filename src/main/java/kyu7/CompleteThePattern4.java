package kyu7;

import java.util.stream.IntStream;

public class CompleteThePattern4 {

    public static String pattern(int n) {
        if (n < 1) return "";
        StringBuilder pattern = new StringBuilder();

        for (int i = 1; i <= n ; i++) {
            int[] numbers = IntStream.rangeClosed(i, n).toArray();
            for (int num : numbers) pattern.append(num);
            pattern.append("\n");
        }

        return pattern.toString().trim();
    }
}
