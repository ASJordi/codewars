package kyu7;

public class ReverseLetter {

    public static String reverseLetter(final String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }

        return result.reverse().toString();
//        return new StringBuilder(s.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }

}
