package easy;

import java.util.Arrays;
import java.util.Objects;

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
