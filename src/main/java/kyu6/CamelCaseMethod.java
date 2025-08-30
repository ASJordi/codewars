package kyu6;

public class CamelCaseMethod {

    public static String camelCase(String str) {
        str = str.trim();
        if (str == null || str.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split("\\s+");

        for (String s : arr) {
            sb.append(s.substring(0, 1).toUpperCase());
            sb.append(s.substring(1));
        }

        return sb.toString();
    }

}
