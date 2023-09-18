package kyu7;

import java.util.*;

public class SmallestValueOfAnArray {

    public static int findSmallest( final int[] numbers, final String toReturn ) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int n : numbers) nums.add(n);
        List<Integer> originalNumbers = List.copyOf(nums);
        int min = Collections.min(nums);
        return toReturn.equals("value") ? min : originalNumbers.indexOf(min);
    }

}
