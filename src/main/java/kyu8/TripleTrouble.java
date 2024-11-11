package kyu8;

public class TripleTrouble {

    public static String tripleTrouble(String one, String two, String three) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < one.length(); i++) {
            res.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }

        return res.toString();

    }

}
