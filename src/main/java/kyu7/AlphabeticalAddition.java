package kyu7;

public class AlphabeticalAddition {

    public static String addLetters(String... letters) {
        if (letters.length == 0) return "z";
        int sum = 0;

        for (String letter : letters) {
            sum += letter.charAt(0) - 'a' + 1;
        }

        return String.valueOf((char) ('a' + (sum - 1) % 26));
    }

}
