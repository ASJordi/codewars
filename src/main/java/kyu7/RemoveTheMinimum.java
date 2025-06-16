package kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveTheMinimum {

    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) return new int[0];

        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        int min = list.stream().min(Integer::compareTo).get();
        list.remove(list.indexOf(min));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
