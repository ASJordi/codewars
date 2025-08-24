package kyu6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrhGrabscrab {

    public static List<String> grabscrab(String s, List<String> words) {
        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (areEquals(s, word)) list.add(word);
        }

        return list;
    }

    private static boolean areEquals(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }

        return true;
    }

}
