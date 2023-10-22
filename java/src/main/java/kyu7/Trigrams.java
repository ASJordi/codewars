package kyu7;

public class Trigrams {

    public static String trigrams(String phrase) {
        if (phrase.length() < 3) return "";
        phrase = phrase.replace(" ", "_");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < phrase.length() - 2; i++) {
            result.append(phrase, i, i + 3).append(" ");
        }

        return result.toString().trim();
    }

}
