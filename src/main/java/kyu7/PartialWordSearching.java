package kyu7;

import java.util.ArrayList;

public class PartialWordSearching {

    public static String[] findWord(String x, String[] y) {
        ArrayList<String> words = new ArrayList<>();

        for (String word : y) {
            if (word.toLowerCase().contains(x)) words.add(word);
        }
        return words.isEmpty() ? new String[]{"Empty"} : words.toArray(new String[0]);
    }

}
