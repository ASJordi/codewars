package kyu8;

import java.util.ArrayList;
import java.util.Arrays;

public class FindThePosition {

    public static String position(char alphabet) {
        ArrayList<String> completeAlphabet = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
        return "Position of alphabet: " + (completeAlphabet.indexOf(String.valueOf(alphabet)) + 1);
    }

}
