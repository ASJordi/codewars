package kyu7;

public class RegexpBasicsIsItAVowel {

    public static boolean isVowel(String s) {
        return s.matches("[aeiouAEIOU]");
    }

}
