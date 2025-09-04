package kyu6;

public class ConvertStringToCamelCase {

    static String toCamelCase(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("[_-]");

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if (i == 0) sb.append(word);
            else sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
        }

        return sb.toString();
    }

}
