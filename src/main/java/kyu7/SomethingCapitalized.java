package kyu7;

public class SomethingCapitalized {

    public static String testSomethingCapitalized(String s) {
        if(s.isBlank()) return "";

        StringBuilder res = new StringBuilder();

        for (String w : s.split(" ")) {
            if (w.length() == 1) res.append(w.toUpperCase()).append(" ");
            else res.append(w, 0, w.length() - 1).append(w.substring(w.length() - 1).toUpperCase()).append(" ");
        }

        return res.toString().trim();
    }

}
