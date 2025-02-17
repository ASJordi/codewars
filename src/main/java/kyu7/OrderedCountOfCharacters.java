package kyu7;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OrderedCountOfCharacters {

    public static List<Pair<Character, Integer>> orderedCount(String text) {
        Map<Character, Integer> words = new LinkedHashMap<>();
        ArrayList<Pair<Character, Integer>> values = new ArrayList<>();

        for (char c : text.toCharArray()) {
            if (words.containsKey(c)) words.replace(c, words.get(c) + 1);
            else words.put(c, 1);
        }

        for (Map.Entry<Character, Integer> entry : words.entrySet()) {
            values.add(Pair.of(entry.getKey(), entry.getValue()));
        }

        return values;
    }

}
