package kyu7;

public class ReplaceEveryNth {

    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        if (n <= 0) return text;

        StringBuilder sb = new StringBuilder(text);
        int count = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == oldValue) count++;
            if (count == n) {
                sb.setCharAt(i, newValue);
                count = 0;
            }
        }

        return sb.toString();
    }

}
