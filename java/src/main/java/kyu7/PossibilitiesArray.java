package kyu7;

import java.util.stream.IntStream;

public class PossibilitiesArray {

    public static boolean isAllPossibilities(int[] arg) {
        if (arg.length == 0) return false;

        for (int i = 0; i < arg.length; i++) {
            int num = i;
            boolean contains = IntStream.of(arg).anyMatch(x -> x == num);
            if (!contains) return false;
        }

        return true;
    }

}
