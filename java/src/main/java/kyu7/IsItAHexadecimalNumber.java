package kyu7;

public class IsItAHexadecimalNumber {

    public static boolean isHexNumber(String s) {
        return s.matches("(?i)(0x)?[\\da-f]+");
    }

}
