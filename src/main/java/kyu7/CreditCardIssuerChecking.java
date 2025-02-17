package kyu7;

import java.util.Arrays;
import java.util.List;

public class CreditCardIssuerChecking {

    public static String getIssuer(String cardNumber) {
        List<String> list = Arrays.asList("51", "52", "53", "54", "55");

        if (cardNumber.length() == 15 && (cardNumber.startsWith("34") || cardNumber.startsWith("37"))) return "AMEX";
        if (cardNumber.startsWith("6011") && cardNumber.length() == 16) return "Discover";
        if (cardNumber.length() == 16 && list.contains(cardNumber.substring(0, 2))) return "Mastercard";
        if (cardNumber.startsWith("4") && (cardNumber.length() == 13 || cardNumber.length() == 16)) return "VISA";

        return "Unknown";
    }

}
