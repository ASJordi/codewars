package kyu7;

public class OddEvenStringSort {

    public static String sortMyString(String s) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) even.append(s.charAt(i));
            else odd.append(s.charAt(i));
        }

        return even.append(" ").toString().concat(odd.toString());
    }

}
