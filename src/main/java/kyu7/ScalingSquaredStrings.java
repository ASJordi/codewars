package kyu7;

public class ScalingSquaredStrings {

    public static String scale(String strng, int k, int v) {
        var arr = strng.split("\n");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = horizontal(arr[i], k);
            for (int j = 0; j < v; j++) {
                sb.append(arr[i]).append("\n");
            }
        }

        return sb.toString().trim();
    }

    private static String horizontal(String word, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            sb.append(Character.toString(word.charAt(i)).repeat(k));
        }

        return sb.toString();
    }

}
