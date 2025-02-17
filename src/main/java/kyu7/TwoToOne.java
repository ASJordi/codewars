package kyu7;

import java.util.Collections;
import java.util.LinkedList;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        StringBuilder words = new StringBuilder();
        StringBuilder newWord = new StringBuilder();
        words.append(s1).append(s2);
        LinkedList<Character> letters = new LinkedList<>();

        for (char c : words.toString().toCharArray()) {
            if (!letters.contains(c)) letters.add(c);
        }

        Collections.sort(letters);

        for (char l : letters) newWord.append(l);

        return newWord.toString();
    }

}
