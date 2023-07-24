package kyu7;

public class GetTheMiddleCharacter {

    public static String getMiddle(String word) {
        int half  = word.length() / 2;
        return word.length() % 2 == 0 ? word.substring(half - 1, half + 1) : word.substring(half, half + 1);
    }

}
