package kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        List<Integer> nums = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
        return "%s %s".formatted(Collections.max(nums), Collections.min(nums));
    }

}
