package kyu7;

public class DisemvowelTrolls {

    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }

}
