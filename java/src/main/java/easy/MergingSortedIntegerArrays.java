package easy;

import java.util.ArrayList;
import java.util.Comparator;

public class MergingSortedIntegerArrays {

    public static int[] mergeArrays(int[] first, int[] second) {
        ArrayList<Integer> nums = new ArrayList();

        for (int f : first) {
            if (nums.contains(f)) continue;;
            nums.add(f);
        }

        for (int s : second) {
            if (nums.contains(s)) continue;;
            nums.add(s);
        }

        nums.sort(Comparator.naturalOrder());

        return nums.stream().mapToInt(Integer::intValue).toArray();
//        return IntStream.concat(IntStream.of(first),IntStream.of(second)).distinct().sorted().toArray();
    }

}
