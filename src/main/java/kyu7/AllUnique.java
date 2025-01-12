package kyu7;

import java.util.*;

public class AllUnique {

    public static boolean hasUniqueChars(String str) {
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (set.contains(c)) return false;
            set.add(c);
        }

        return true;
    }

}
