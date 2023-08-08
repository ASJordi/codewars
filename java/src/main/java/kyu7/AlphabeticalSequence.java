package kyu7;

import java.util.Arrays;

public class AlphabeticalSequence {

    public static String alphaSeq(String s) {
        s = s.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder res = new StringBuilder();

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        for (int i = 0; i < sorted.length(); i++) {
            int index = alphabet.indexOf(sorted.charAt(i)) + 1;
            String temp = Character.toString(sorted.charAt(i)).repeat(index);
            String upper = temp.substring(0, 1).toUpperCase() + temp.substring(1);
            res.append(upper).append(",");
        }

        return res.substring(0, res.length() - 1);
    }

}
