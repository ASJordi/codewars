package kyu7;

public class Vaporcode {

    public static String vaporcode(String s) {
        StringBuilder res = new StringBuilder();
        s = s.replace(" ", "").toUpperCase();

        for (char l : s.toCharArray()) {
            res.append(l).append("  ");
        }

        return res.toString().trim();
    }

}
