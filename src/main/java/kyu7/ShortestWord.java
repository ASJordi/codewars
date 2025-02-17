package kyu7;

public class ShortestWord {

    public static int findShort(String s) {
        String[] words = s.split(" ");

        String shortest = words[0];

        for (String str : words) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }

        return shortest.length();
    }

}
