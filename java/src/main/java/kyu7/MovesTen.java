package kyu7;

public class MovesTen {

    public static String moveTen(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int letterIndex = alphabet.indexOf(s.charAt(i));
            int newPos = (letterIndex + 10) % 26;
            word.append(alphabet.charAt(newPos));
        }

        return word.toString();
    }

}
