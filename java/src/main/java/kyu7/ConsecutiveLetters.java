package kyu7;

import java.util.Arrays;

public class ConsecutiveLetters {

    public static boolean solve(String s){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return alphabet.contains(sorted);
    }

}
