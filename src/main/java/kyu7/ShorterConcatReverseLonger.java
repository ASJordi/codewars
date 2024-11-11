package kyu7;

public class ShorterConcatReverseLonger {

    public static String shorterReverseLonger(String a, String b) {
        return b.length() > a.length() ? a + new StringBuilder(b).reverse() + a :
                b + new StringBuilder(a).reverse() + b;
    }

}
