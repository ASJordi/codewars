package kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        Map<Character, Integer> chars = new HashMap<>();
        int count = 0;

        for (char c : text.toCharArray()){
            if (chars.containsKey(c)) chars.replace(c, chars.get(c) + 1);
            else chars.put(c, 1);
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()){
            if (entry.getValue() > 1) count++;
        }

        return count;
    }

}
