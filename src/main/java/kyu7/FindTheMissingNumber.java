package kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTheMissingNumber {

    public static int missingNo(int[] nums) {
	var sum = Arrays.stream(nums).sum();
	var fullSum = IntStream.rangeClosed(0, 100).sum();
	return fullSum - sum;
    }

}
