package kyu7;

public class InspiringStrings {

    public static String longestWord(String wordString) {

        if (wordString == null || wordString.trim().isEmpty()) return null;

        String[] words = wordString.split("\\s+");
        int maxLength = 0;
        String longestWord = null;

        for (String word : words) {
            int wordLength = word.length();
            if (wordLength >= maxLength) {
                maxLength = wordLength;
                longestWord = word;
            }
        }

        return longestWord;
    }

}
