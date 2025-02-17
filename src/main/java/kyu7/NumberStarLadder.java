package kyu7;

public class NumberStarLadder {

    public static String pattern(int n) {
        if (n == 1) return "1";
        StringBuilder res = new StringBuilder();

        res.append(1);
        for (int i = 2; i <= n; i++) {
            res.append("\n").append(1).append("*".repeat(i - 1)).append(i);
        }

        return res.toString();
    }

}
