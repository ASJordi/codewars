package kyu7;

public class SimpleStringReversalII {

    public static String solve(String s, int a, int b){
        StringBuilder newString = new StringBuilder();

        if (b >= s.length()) b = s.length() - 1;
        newString.append(s, 0, a).append(new StringBuilder().append(s, a, b + 1).reverse()).append(s.substring(b + 1));

        return newString.toString();
    }

}
