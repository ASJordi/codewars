package kyu6;

import java.util.LinkedHashSet;
import java.util.Set;

public class MoreZerosThanOnes {

    public static char[] moreZeros(String s) {
        StringBuilder result = new StringBuilder();
        Set<String> uniqueLetters = new LinkedHashSet<>();

        for (char c : s.toCharArray()) uniqueLetters.add(Character.toString(c));

        String word = String.join("", uniqueLetters);

        for (char c : word.toCharArray()){
            String bin = Integer.toBinaryString(c);
            if (hasMoreZeros(bin)) result.append(c);
        }

        return result.toString().toCharArray();
    }

    private static boolean hasMoreZeros(String s){
        int cZeros = 0;
        int cOnes = 0;

        for (char c : s.toCharArray()){
            if (c == '1') cOnes++;
            if (c == '0') cZeros++;
        }

        return cZeros > cOnes;
    }

}
