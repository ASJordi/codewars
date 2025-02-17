package kyu7;

public class CompleteThePatternTwo {

    public static String pattern(int n) {
        StringBuilder res = new StringBuilder();
        StringBuilder row = new StringBuilder();

        while (n > 0) {
            res.insert(0, row.append(n--)).insert(0, n > 0 ? "\n" : "");
        }

        return res.toString();
    }

}
