package kyu7;

import java.util.Arrays;

public class FindTheStrayNumber {

    public static int stray(int[] numbers) {
        Arrays.sort(numbers);
        if (numbers[0] != numbers[1]) return numbers[0];
        else return numbers[numbers.length - 1];
    }

}
