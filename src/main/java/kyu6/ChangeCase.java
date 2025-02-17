package kyu6;

import static java.util.regex.Pattern.compile;

public class ChangeCase {

    public static String toSentenceCase(String string) {
        return compile("(?<=[.!?] |^)\\w").matcher(string.toLowerCase()).replaceAll(m -> m.group().toUpperCase());
    }

    public static String toLowerCase(String string) {
        return string.toLowerCase();
    }

    public static String toUpperCase(String string) {
        return string.toUpperCase();
    }

    public static String capitalizeEachWord(String string) {
        if (string.isBlank()) return string;
        String[] arr = string.split(" ");
        StringBuilder res = new StringBuilder();

        for (String s : arr) {
            String first = String.valueOf(s.charAt(0)).toUpperCase();
            res.append(first).append(s.substring(1).toLowerCase()).append(" ");
        }

        return res.toString().trim();
    }

    public static String toToggleCase(String string) {
        if (string.isBlank()) return string;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) res.append(String.valueOf(string.charAt(i)).toUpperCase());
            else if (Character.isUpperCase(string.charAt(i)))
                res.append(String.valueOf(string.charAt(i)).toLowerCase());
            else res.append(string.charAt(i));
        }

        return res.toString();
    }

}
