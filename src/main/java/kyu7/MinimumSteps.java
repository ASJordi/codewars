package kyu7;

import java.util.Arrays;

public class MinimumSteps {

    public static int minimumSteps(int[] numbers, int k) {
        Arrays.sort(numbers);
        int times = 0;
        int sum = 0;

        while (sum < k) {
            sum += numbers[times];
            times++;
        }

        return times - 1;
    }

}
