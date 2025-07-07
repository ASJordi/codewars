package kyu7;

import java.util.*;
import java.util.stream.IntStream;

public class SortAnArrayByValueAndIndex {

    public static int[] sortByValueAndIndex(int[] array) {
	    return IntStream.range(0, array.length)
                .boxed()
                .sorted(Comparator.comparingInt(i -> (i + 1) * array[i]))
                .mapToInt(i -> array[i]).toArray();
    }
    
}
