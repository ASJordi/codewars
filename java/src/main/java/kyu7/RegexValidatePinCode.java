package kyu7;

public class RegexValidatePinCode {

    public static boolean validatePin(String pin) {
        if (pin.length() != 4 && pin.length() != 6) return false;

        for (char d : pin.toCharArray()) if (!Character.isDigit(d)) return false;

        return true;
    }

}
