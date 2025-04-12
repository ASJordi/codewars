package kyu7;

import java.util.*;

public class ArrayLeaders {

    public static List<Integer> arrayLeaders(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        int sum = Arrays.stream(numbers).sum();

        for (int curr : numbers) {
            sum -= curr;
            if (curr > sum) list.add(curr);
        }

        return list;
    }

}
