package kyu7;

public class RegexpBasicsIsItALetter {

    public static boolean isLetter(String s) {
        if (s.isBlank() || s.length() > 1) return false;
        return Character.isLetter(s.charAt(0));
//        return s.matches("[a-zA-Z]");
    }

}
