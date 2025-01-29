package kyu7;

public class CreditCardMask {

    public static String maskify(String str) {
        if (str.length() < 4) return str;
        int len = str.length() - 4;
        return str.substring(0, len).replaceAll(".", "#") + str.substring(len);
    }

}
