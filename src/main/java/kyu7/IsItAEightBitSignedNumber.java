package kyu7;

public class IsItAEightBitSignedNumber {

    public static boolean isSignedEightBitNumber(String s) {
        return s.matches("0|-128|-?[1-9]\\d?|-?1[0-1]\\d|-?12[0-7]");
    }

}
