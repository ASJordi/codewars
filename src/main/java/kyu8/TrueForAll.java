package kyu8;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class TrueForAll {

    public static boolean all(int[] list, IntPredicate predicate) {
//        for (int l : list) {
//            if (!predicate.test(l)) return false;
//        }
//        return true;
        return Arrays.stream(list).allMatch(predicate);
    }

}
