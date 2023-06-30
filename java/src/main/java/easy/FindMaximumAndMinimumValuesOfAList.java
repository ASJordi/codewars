package easy;

import java.util.Arrays;

public class FindMaximumAndMinimumValuesOfAList {

    public static int min(int[] list) {

        Arrays.sort(list);
        return list[0];
        // return Arrays.stream(list).min().getAsInt();

    }

    public static int max(int[] list) {
        Arrays.sort(list);
        return list[list.length - 1];
        // return Arrays.stream(list).max().getAsInt();
    }

}
