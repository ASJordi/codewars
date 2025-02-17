package kyu7;

public class RemoveConsecutiveDuplicateWords {

    public static String removeConsecutiveDuplicates(String s) {

        if (s == null || s.isEmpty()) return "";

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equals(words[i - 1])) {
                result.append(words[i]).append(" ");
            }
        }

        return result.toString().trim();
    }

}
