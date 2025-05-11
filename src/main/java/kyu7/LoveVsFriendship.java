package kyu7;

public class LoveVsFriendship {

    public static int wordsToMarks (String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return text.chars().map(c -> alphabet.indexOf(c) + 1).sum();
    }

}
