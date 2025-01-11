package kyu7;

public class ALettersBestFriend {

    public static boolean bestFriend(String txt, char a, char b) {
        char[] chars = txt.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == a) {
                if (i == chars.length - 1 || chars[i + 1] != b) return false;
            }
        }

        return true;
        // return !txt.matches(".*" + a + "(?!" + b + ").*");
    }

}
