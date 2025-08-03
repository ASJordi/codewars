package kyu7;

import java.util.Arrays;

public class TwoOldestAges {

    public static int[] twoOldestAges(int[] ages) {
        Arrays.sort(ages);
        return new int[]{ages[ages.length - 2], ages[ages.length - 1]};
    }

}
