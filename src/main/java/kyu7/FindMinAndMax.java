package kyu7;

import java.util.Collections;
import java.util.List;

public class FindMinAndMax {

    public static int[] getMinMax(List<Integer> list) {
        return new int[]{Collections.min(list), Collections.max(list)};
    }

}
