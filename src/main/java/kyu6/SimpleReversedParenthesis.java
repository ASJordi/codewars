package kyu6;

public class SimpleReversedParenthesis {

    public static int solve(String s) {
        if (s.length() % 2 != 0) return -1;
        if (s.contains("()")) return solve(s.replace("()", ""));
        String temp = s.replaceAll("\\)\\)|\\(\\(", "");
        return (s.length() - temp.length()) / 2 + temp.length();
    }

}
