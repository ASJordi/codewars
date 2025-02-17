package kyu7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CharacterCounter {

    public static boolean validateWord(String word) {
        HashMap<Character, Integer> countCharMap = new HashMap();
        word = word.toLowerCase();
        char[] wordArray = word.toCharArray();

        for (char c : wordArray) {
            if (countCharMap.containsKey(c)) {
                countCharMap.put(c, countCharMap.get(c) + 1);
            } else {
                countCharMap.put(c, 1);
            }
        }

        Set<Integer> values = new HashSet<>(countCharMap.values());
        return values.size() == 1;
    }

}
