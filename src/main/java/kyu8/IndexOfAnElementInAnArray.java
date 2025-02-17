package kyu8;

import java.util.Arrays;

class IndexOfAnElementInAnArray {
    static String kata(String[] a, String s) {
        int i = Arrays.asList(a).indexOf(s);
        return i != -1 ? String.valueOf(i) : "Not found";
    }
}