package kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Incrementer {

    public static int[] incrementer(int[] numbers) {
        int[] values = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int index = i + 1;
            int numPlusIndex = numbers[i] + index;
            if (numPlusIndex < 10) values[i] = numPlusIndex;
            else values[i] = numPlusIndex % 10;
        }

        return values;
//        return IntStream.range(0, numbers.length).map(i -> (numbers[i] + i + 1) % 10).toArray();
    }

}
