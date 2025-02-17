package kyu7;

public class StringInterlacing {

    public static String interlace(String first, String second) {
        first = first.replace(" ", "");
        second = second.replace(" ", "");
        StringBuilder result = new StringBuilder();

        if (first.length() != second.length()) {
            String s1 = first;
            String s2 = second;
            int max = Math.max(s1.length(), s2.length());

            if (s1.length() == max) {
                int diff = max - s2.length();
                s2 = s2 + s2.substring(0, diff);
                second = s2;
                max = 0;
            }

            if (s2.length() == max) {
                int diff = max = s1.length();
                s1 = s1 + s1.substring(0, diff);
                first = s2;
                second = s1;
            }
        }

        for (int i = 0; i < first.length(); i++) {
            result.append(first.charAt(i));
            result.append(second.charAt(i));
        }

        return result.toString();
    }

}
