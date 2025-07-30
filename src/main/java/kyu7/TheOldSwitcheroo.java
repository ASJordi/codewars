package kyu7;

public class TheOldSwitcheroo {

    public static String vowel2Index(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) res.append(i + 1);
            else res.append(c);
        }

        return res.toString();
    }

}
