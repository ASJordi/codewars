package kyu7;

public class VowelCount {

    public static int getCount(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = Character.toString(str.charAt(i));
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) sum++;
        }
        return sum;
//        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

}
