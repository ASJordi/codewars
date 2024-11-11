package kyu7;

public class Mumbling {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            String c = Character.toString(s.charAt(i));
            result.append(c.toUpperCase()).append(c.repeat(i)).append("-");
        }

        return result.substring(0, result.length() - 1);
    }

}
