package kyu6;

import java.util.*;

public class CharacterWithLongestConsecutiveRepetition {

    public static Object[] longestRepetition(String s) {
        if (s.isBlank()) return new Object[]{"", 0};

        Map<Character, Integer> map = new LinkedHashMap<>();
        char c = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) count++;
            else {
                if (map.containsKey(c) && map.get(c) < count) {
                    map.remove(c);
                    map.put(c, count);
                }
                else if (!map.containsKey(c)) map.put(c, count);
                c = s.charAt(i);
                count = 1;
            }
        }

        if (map.containsKey(c) && map.get(c) < count) {
            map.remove(c);
            map.put(c, count);
        }
        else if (!map.containsKey(c)) map.put(c, count);

        int max = 0;
        char ch = ' ';

        for (var entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ch = entry.getKey();
            }
        }

        return new Object[]{ch + "", max};
    }

}
