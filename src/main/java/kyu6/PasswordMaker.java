package kyu6;

import java.util.List;
import java.util.Random;

public class PasswordMaker {

    private static final Random random = new Random();

    public static String makePassword(int len, boolean flagUpper, boolean flagLower, boolean flagDigit) {
        StringBuilder password = new StringBuilder();

        while (password.length() < len) {
            if (password.length() < len && (flagLower)) {
                String r = getLowercaseLetter();
                if (!password.toString().contains(r)) password.append(r);
            }
            if (password.length() < len && flagUpper) {
                String r = getUppercaseLetter();
                if (!password.toString().contains(r)) password.append(r);
            }
            if (password.length() < len && flagDigit) {
                String r = getNumber();
                if (!password.toString().contains(r)) password.append(r);
            }
        }

        return password.toString();
    }

    public static String getUppercaseLetter() {

        List<String> uppercaseLetter = List.of(
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        );

        return uppercaseLetter.get(random.nextInt(uppercaseLetter.size()));

    }

    public static String getLowercaseLetter() {

        List<String> lowercaseLetter = List.of(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        );

        return lowercaseLetter.get(random.nextInt(lowercaseLetter.size()));

    }

    public static String getNumber() {

        List<String> numbers = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

        return numbers.get(random.nextInt(numbers.size()));

    }

}
