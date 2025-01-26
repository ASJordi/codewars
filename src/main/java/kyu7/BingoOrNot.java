package kyu7;

public class BingoOrNot {

    public static String bingo(int[] numberArray) {
        var expected = "BINGO";
        StringBuilder actual = new StringBuilder();

        for (int n : numberArray) {
            char letter = (char) (n + 64);
            actual.append(letter);
        }

        for (int i = 0; i < expected.length(); i++) {
            if (actual.indexOf(String.valueOf(expected.charAt(i))) == -1) return "LOSE";
        }

        return "WIN";
    }

}
