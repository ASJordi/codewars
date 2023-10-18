package kyu6;

public class BasicCompression {

    public static String compress(String s) {
        StringBuilder result = new StringBuilder("[");
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == currentChar) count++;
            else {
                result.append("[").append(count).append(",\"").append(currentChar).append("\"],");
                currentChar = c;
                count = 1;
            }
        }

        result.append("[").append(count).append(",\"").append(currentChar).append("\"]");
        result.append("]");

        return result.length() > s.length() ? s : result.toString();
    }

    public static String decompress(String s) {
        if (!s.contains("[")) return s;
        StringBuilder sb = new StringBuilder();
        String parts[] = s.substring(2, s.length() - 1).split(",\\[");
        for (String p : parts) {
            int n = Integer.valueOf(p.substring(0, p.indexOf(",")));
            char c = p.charAt(p.indexOf("\"") + 1);
            sb.append(String.valueOf(c).repeat(Math.max(0, n)));
        }
        return sb.toString();
    }

}
