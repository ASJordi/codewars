package kyu7;

public class IsItASixBitUnsignedNumber {

    public static boolean sixBitNumber(String n) {

        if (!n.matches("^0$|^[1-9][0-9]*$")) return false;

        try {
            int num = Integer.parseInt(n);
            return num >= 0 && num <= 63;
        } catch (NumberFormatException e) {
            return false;
        }
//        return n.matches("[1-5]?\\d|6[0-3]");
    }


}
