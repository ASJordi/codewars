package kyu7;

import static java.util.Arrays.stream;

public class MaximumLengthDifference {

    public static int mxdiflg(String[] a1, String[] a2) {
        return a1.length > 0 && a2.length > 0 ? Math.max(
                stream(a1).mapToInt(String::length).max().getAsInt() - stream(a2).mapToInt(String::length).min().getAsInt(),
                stream(a2).mapToInt(String::length).max().getAsInt() - stream(a1).mapToInt(String::length).min().getAsInt()
        ) : - 1;
    }

}
