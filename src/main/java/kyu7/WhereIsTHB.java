package kyu7;

public class WhereIsTHB {

    public static String testing(String initial) {
        if (initial == null || initial.isBlank()) return "";

        StringBuilder letters = new StringBuilder();

        for (int i = 0; i < initial.length(); i++) {
            if ("thbTHB".contains(String.valueOf(initial.charAt(i)))) letters.append(initial.charAt(i));
        }

        return letters.toString();
    }
}
