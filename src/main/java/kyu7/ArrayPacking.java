package kyu7;

import java.util.stream.IntStream;

public class ArrayPacking { // Simple Fun #9: Array Packing

    public static long arrayPacking(int[] arr) {
	return IntStream.range(0, arr.length).mapToLong(i -> (long) arr[i] << (i * 8)).sum();
    }

}
