package kyu7;

import java.util.Arrays;

public class TheAlphabetProduct {

    public static int alphabet(int[] ns) {
        Arrays.sort(ns);
        return ns[7] / (ns[0] * ns[1] == ns[2] ? ns[3] : ns[2]);
    }

}
