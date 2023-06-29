package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumMixedArray {

    public int sum(List<?> mixed) {

        int sum = mixed.stream()
                .mapToInt(element -> Integer.parseInt(String.valueOf(element)))
                .sum();

        return sum;

    }

}
