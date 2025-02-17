package kyu8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestUnusedID {

    public static int nextId(int[] ids) {

        if (ids.length < 1 || ids == null) return 0;

        HashSet<Integer> orderedIds = (HashSet<Integer>) Arrays.stream(ids).boxed().collect(Collectors.toSet());
        int max = Arrays.stream(ids).max().getAsInt();
        int[] nums = IntStream.rangeClosed(0, max).toArray();

        for (int i = 0; i < orderedIds.size(); i++) {
            if (!orderedIds.contains(nums[i])) {
                return nums[i];
            }
        }

        return max + 1;
//        return IntStream.range(0, ids.length + 1).filter(id -> !IntStream.of(ids).anyMatch(x -> x == id)).findFirst().getAsInt();

    }

}
