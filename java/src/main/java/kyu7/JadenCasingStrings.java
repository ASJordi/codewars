package kyu7;

public class JadenCasingStrings {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isBlank()) return null;

        String[] words = phrase.split(" ");
        StringBuilder newPhrase = new StringBuilder();

        for (String word : words){
            String first = Character.toString(word.charAt(0)).toUpperCase();
            String rest = word.substring(1).toLowerCase();
            newPhrase.append(first).append(rest).append(" ");
        }

        return newPhrase.toString().trim();
    }

}
