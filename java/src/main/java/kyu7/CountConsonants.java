package kyu7;

import java.util.ArrayList;
import java.util.Arrays;

public class CountConsonants {

    public static int getCount(String str) {
        ArrayList<String> consonants = new ArrayList<>(Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"));
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (consonants.contains(Character.toString(str.charAt(i)))) count++;
        }

        return count;
//        return str.replaceAll("[^A-Za-z]|[AEIOUaeiou]", "").length();
    }

}
