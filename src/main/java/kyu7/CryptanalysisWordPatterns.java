package kyu7;

import java.util.HashMap;
import java.util.Map;

public class CryptanalysisWordPatterns {

    public static String wordPattern(String word) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        int count = 0;
        word = word.toLowerCase();

        for (char w : word.toCharArray()) {
            if (!map.containsKey(w)) {
                map.put(w, count);
                result.append(map.get(w)).append(".");
                count++;
            } else result.append(map.get(w)).append(".");
        }

        return result.substring(0, result.length() - 1);
    }

}
