package kyu7;

public class UniqueStringCharacters {

    public static String solve(String a, String b) {
        StringBuilder uniqueString = new StringBuilder();

        for (char c : a.toCharArray()) {
            if (!b.contains(Character.toString(c))) uniqueString.append(c);
        }

        for (char c : b.toCharArray()) {
            if (!a.contains(Character.toString(c))) uniqueString.append(c);
        }

        return uniqueString.toString();
    }

}
