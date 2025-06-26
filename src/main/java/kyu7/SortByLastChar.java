package kyu7;

import java.util.Arrays;
import java.util.Comparator;

public class SortByLastChar {

    public static String[] last(String x) {
        return Arrays.stream(x.split(" ")).sorted(Comparator.comparingInt(a -> a.charAt(a.length() - 1))).toArray(String[]::new);
    }

}
