package kyu7;

import java.util.function.Function;

public class MultiplyAllElementsInAnArray {

    public static Function<Integer, int[]> multiplyAll(int[] array) {
        return (multiplier) -> {
            if (array.length == 0) return new int[0];
            int[] result = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i] * multiplier;
            }
            return result;
        };
    }

}
