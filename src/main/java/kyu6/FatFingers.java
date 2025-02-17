package kyu6;

public class FatFingers {

    public static String fatFingers(String str) {
        if (str == null) return null;
        boolean isTyped = false;
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                isTyped = !isTyped;
                continue;
            }

            result.append(isTyped ? Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c) : c);
        }

        return result.toString();
    }

}
