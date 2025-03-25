package kyu8;

public class SumTheStrings {

    public static String sumStr(String a, String b) {
        var one = a.isBlank() ? 0 : Integer.parseInt(a);
        var two = b.isBlank() ? 0 : Integer.parseInt(b);
        return String.valueOf(one + two);
    }

}
