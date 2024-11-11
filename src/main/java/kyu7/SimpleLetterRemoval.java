package kyu7;

public class SimpleLetterRemoval {


    public static String solve(String s, int k) {
        StringBuilder result = new StringBuilder(s);

        for (char ch = 'a'; ch <= 'z' && k > 0; ch++) {
            int index;
            while ((index = result.indexOf(String.valueOf(ch))) != -1 && k > 0) {
                result.deleteCharAt(index);
                k--;
            }
        }

        return result.toString();
    }

}
