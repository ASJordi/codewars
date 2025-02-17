package kyu7;

import java.util.HashMap;

public class ScrabbleScore {

    public static int scrabbleScore(String word) {
        if (word == null || word.isBlank()) return 0;
        HashMap<String, Integer> words = wordsMap();
        int score = 0;
        word = word.replace(" ", "").toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            String w = Character.toString(word.charAt(i));
            if (words.containsKey(w)) score += words.get(w);
        }

        return score;
    }

    private static HashMap<String, Integer> wordsMap() {
        HashMap<String, Integer> words = new HashMap<>();
        words.put("A", 1);
        words.put("E", 1);
        words.put("I", 1);
        words.put("O", 1);
        words.put("U", 1);
        words.put("L", 1);
        words.put("N", 1);
        words.put("R", 1);
        words.put("S", 1);
        words.put("T", 1);
        words.put("D", 2);
        words.put("G", 2);
        words.put("B", 3);
        words.put("C", 3);
        words.put("M", 3);
        words.put("P", 3);
        words.put("F", 4);
        words.put("H", 4);
        words.put("V", 4);
        words.put("W", 4);
        words.put("Y", 4);
        words.put("K", 5);
        words.put("J", 8);
        words.put("X", 8);
        words.put("Q", 10);
        words.put("Z", 10);

        return words;
    }

}
