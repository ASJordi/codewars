package kyu7;

public class Spacify {

    public static String spacify(String str) {
        StringBuilder word = new StringBuilder();

        for (char c : str.toCharArray()) {
            word.append(c).append(" ");
        }

        return word.toString().trim();
    }

}
