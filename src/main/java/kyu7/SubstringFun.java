package kyu7;

public class SubstringFun {

    public static String nthChar(String[] words) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i].charAt(i));
        }

        return sb.toString();
    }

}
