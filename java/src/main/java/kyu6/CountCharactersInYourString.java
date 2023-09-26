package kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> count  = new HashMap<>();

        for (char c : str.toCharArray()){
           if (!count.containsKey(c)) count.put(c, 1);
           else count.replace(c, count.get(c) + 1);
        }

        return count;
    }

}
