package kyu7;

public class SplitInParts {

    public static String splitInParts(String s, int partLength) {
        StringBuilder res = new StringBuilder(s);
        for (int i = partLength++; i < res.length(); i += partLength) {
            res.insert(i, " ");
        }
        return res.toString();
    }

}
