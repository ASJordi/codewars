package kyu7;

import java.util.ArrayList;
import java.util.List;

public class FindTheVowels {

    public static int[] vowelIndices(String word) {
        List<Integer> list = new ArrayList<>();
        String vowels = "aeiouyAEIOUY";

        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) list.add(i + 1);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
