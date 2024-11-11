package kyu7;

public class ValidSpacing {

    public static boolean validSpacing(String s) {
        return s.trim().replace("  ", "").equals(s);
    }

}
