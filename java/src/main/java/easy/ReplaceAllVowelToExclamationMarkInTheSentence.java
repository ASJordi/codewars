package easy;

public class ReplaceAllVowelToExclamationMarkInTheSentence {

    public static String replace(final String s) {

        return s.replaceAll("[aeiouAEIOU]", "!");

    }

}
