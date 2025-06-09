package kyu7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ProductOfMaximumsOfArray {

    public static long maxProduct(int[] numbers, int sub_size) {
        long product = 1;

        var list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < sub_size; i++) {
            product *= list.get(i);
        }

        return product;
    }

}
