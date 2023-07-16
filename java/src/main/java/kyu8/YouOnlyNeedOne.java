package kyu8;

import java.util.Arrays;

public class YouOnlyNeedOne {

    public static boolean check(Object[] a, Object x) {

//        for (Object ob : a) {
//            if (Objects.equals(ob, x)) return true;
//        }
//
//        return false;

        return Arrays.asList(a).contains(x);

    }

}
