package kyu7;

public class IsItAEightBitUnsignedNumber {

    public static boolean eightBitNumber(String n) {
        try {
            if (n.isEmpty() || (n.length() > 1 && n.startsWith("0")) || n.startsWith("-")) return false;
            int number = Integer.parseInt(n);
            return number >= 0 && number <= 255;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
