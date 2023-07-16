package kyu8;

import java.util.List;

public class SumMixedArray {

    public int sum(List<?> mixed) {

        int sum = mixed.stream()
                .mapToInt(element -> Integer.parseInt(String.valueOf(element)))
                .sum();

        return sum;

    }

}
