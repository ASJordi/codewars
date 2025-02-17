package kyu7;

public class ConvertingFromBase10To16 {

    public static String convertToHex(int a) {
        if (a == 0) return "x0" + a;
        StringBuilder hexadecimal = new StringBuilder();

        while (a > 0) {
            int remainder = a % 16;
            char hexDigit;

            if (remainder < 10) hexDigit = (char) ('0' + remainder);
            else hexDigit = (char) ('A' + remainder - 10);

            hexadecimal.insert(0, hexDigit);
            a /= 16;
        }

        return hexadecimal.insert(0, "0x").toString();
    }

}
