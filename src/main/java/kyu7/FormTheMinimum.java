package kyu7;

import java.util.HashSet;

public class FormTheMinimum {

    public static int minValue(int[] values){
        HashSet<Integer> nums = new HashSet<>();
        StringBuilder res = new StringBuilder();

        for (int v : values) nums.add(v);

        for (int n : nums) res.append(n);

        return Integer.parseInt(res.toString());
    }

}
