package kyu7;

public class HelpBobCountLettersAndDigits {

    public static int countLettersAndDigits(String input) {
        int count = 0;

        for (var c : input.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) count++;
        }

        return count;
    }

}
