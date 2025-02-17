package kyu8;

public class StringyStrings {

    public static String stringy(int size) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                res.append("1");
            } else {
                res.append("0");
            }
        }

        return res.toString();

    }

}
