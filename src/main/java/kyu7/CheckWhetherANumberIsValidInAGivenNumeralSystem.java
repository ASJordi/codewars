package kyu7;

public class CheckWhetherANumberIsValidInAGivenNumeralSystem {

    public static boolean validateBase(String num, int base) {
        String validChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".substring(0, base);

        for (char c : num.toCharArray()) {
            if (validChars.indexOf(c) == -1) return false;
        }

        return true;
    }

}
