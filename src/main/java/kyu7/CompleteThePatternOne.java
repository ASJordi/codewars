package kyu7;

public class CompleteThePatternOne {

    public static String pattern(int n) {
        if (n <= 0) return "";
        StringBuilder res = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i == n) res.append(String.valueOf(i).repeat(i));
            else res.append(String.valueOf(i).repeat(i)).append("\n");
        }

        return res.toString();
    }

}
