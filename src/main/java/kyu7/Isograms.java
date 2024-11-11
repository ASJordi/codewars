package kyu7;

import java.util.*;

public class Isograms {

    public static boolean isIsogram(String str) {
        if (str.isBlank()) return true;
        str = str.toLowerCase();
        String[] arr = str.split("");
        Set<String> letters = new HashSet<>(Arrays.asList(arr));
        return letters.size() == str.length();
    }

}
