package kyu7;

public class GreenGlassDoor {

    boolean stepThroughWith(String s) {
        if (s == null || s.length() < 2) return false;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) return true;
        }

        return false;
    }

}