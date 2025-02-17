package kyu7;

public class FromAToZ {

    public static String gimmeTheLetters(String s) {
        StringBuilder letters = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        s = s.replace("-", "");

        if (Character.isUpperCase(s.charAt(0))) alphabet = alphabet.toUpperCase();
        int start = alphabet.indexOf(s.charAt(0));
        int end = alphabet.indexOf(s.charAt(1));

        for (int i = start; i <= end; i++) letters.append(alphabet.charAt(i));

        return letters.toString();
    }
}
