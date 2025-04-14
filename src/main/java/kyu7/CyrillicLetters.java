package kyu7;

public class CyrillicLetters {

    public static boolean isCyrillic(char letter) {
        return Character.UnicodeBlock.of(letter).equals(Character.UnicodeBlock.CYRILLIC);
    }

}
