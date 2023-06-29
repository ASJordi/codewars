package easy;

import java.util.Arrays;

public class ReduceButGrow {

    public static int grow(int[] x){

        int res = 1;

        for (int value : x) {
            res *= value;
        }

        return res;

    }

}
