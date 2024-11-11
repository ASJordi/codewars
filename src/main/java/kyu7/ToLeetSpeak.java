package kyu7;

import java.util.HashMap;

public class ToLeetSpeak {

    static String toLeetSpeak(final String speak) {
        StringBuilder leetWord = new StringBuilder();
        HashMap<Character, Character> leet = new HashMap<>();
        leet.put('A', '@'); leet.put('B', '8'); leet.put('C', '(');
        leet.put('D', 'D'); leet.put('E', '3'); leet.put('F', 'F');
        leet.put('G', '6'); leet.put('H', '#'); leet.put('I', '!');
        leet.put('J', 'J'); leet.put('K', 'K'); leet.put('L', '1');
        leet.put('M', 'M'); leet.put('N', 'N'); leet.put('O', '0');
        leet.put('P', 'P'); leet.put('Q', 'Q'); leet.put('R', 'R');
        leet.put('S', '$'); leet.put('T', '7'); leet.put('U', 'U');
        leet.put('V', 'V'); leet.put('W', 'W'); leet.put('X', 'X');
        leet.put('Y', 'Y'); leet.put('Z', '2');

        for (char c : speak.toCharArray()){
            if (leet.containsKey(c)) leetWord.append(leet.get(c));
            else leetWord.append(c);
        }

        return leetWord.toString();
    }

}
