package kyu7;

public class ScrollingText {

    public static String[] scrollingText(String text) {
        text = text.toUpperCase();
        int len = text.length();
        String[] arr = new String[len];

        for(int i = 0; i < len; i++) {
            arr[i] = text;
            text = text.substring(1, len) + text.charAt(0);
        }

        return arr;
    }

    public static String[] scrollingText2(String text) {
        String[] arr = new String[text.length()];
        StringBuilder sb = new StringBuilder(text.toUpperCase());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sb.toString();
            sb.append(sb.charAt(0)).deleteCharAt(0);
        }

        return arr;
    }

}
