package kyu7;

import java.util.Map;
import static java.util.Map.entry;

public class NumbersToLetters {

    private static Map<String, Character> map = Map.ofEntries(
            entry("26", 'a'), entry("25", 'b'), entry("24", 'c'), entry("23", 'd'), entry("22", 'e'),
            entry("21", 'f'), entry("20", 'g'), entry("19", 'h'), entry("18", 'i'), entry("17", 'j'),
            entry("16", 'k'), entry("15", 'l'), entry("14", 'm'), entry("13", 'n'), entry("12", 'o'),
            entry("11", 'p'), entry("10", 'q'), entry("9", 'r'), entry("8", 's'), entry("7", 't'),
            entry("6", 'u'), entry("5", 'v'), entry("4", 'w'), entry("3", 'x'), entry("2", 'y'),
            entry("1", 'z'), entry("27", '!'), entry("28", '?'), entry("29", ' ')
    );

    public static String switcher(String[] arr) {
        StringBuilder sb = new StringBuilder();

        for (var s : arr) {
            sb.append(map.get(s));
        }

        return sb.toString();
    }

}
