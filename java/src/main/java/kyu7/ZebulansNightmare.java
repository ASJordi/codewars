package kyu7;

public class ZebulansNightmare {

    public static String zebulansNightmare(final String functionName) {
        String[] words = functionName.split("_");
        StringBuilder upper = new StringBuilder();
        upper.append(words[0]);

        for (int i = 1; i < words.length; i++) {
            String first = String.valueOf(words[i].charAt(0)).toUpperCase();
            upper.append(first).append(words[i].substring(1));
        }

        return upper.toString();
    }

}
