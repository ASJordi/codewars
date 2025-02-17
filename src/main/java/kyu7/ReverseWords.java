package kyu7;

public class ReverseWords {

    public static String reverseWords(final String original) {
        if (original.isBlank()) return original;
        String[] words = original.split(" ");
        StringBuilder res = new StringBuilder();

        for (String w : words) {
            StringBuilder r = new StringBuilder(w);
            res.append(r.reverse()).append(" ");
        }
        return res.toString().trim();
    }

}
