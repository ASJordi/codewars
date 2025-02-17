package kyu6;

import java.util.ArrayList;
import java.util.Collections;

public class HighestScoringWord {

    public static String high(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] arr = s.split(" ");
        ArrayList<Integer> values = new ArrayList<>();

        for (String word : arr) {
            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                sum += alphabet.indexOf(word.charAt(i)) + 1;
            }
            values.add(sum);
        }

        int max = values.indexOf(Collections.max(values));

        return arr[max];
    }
}
