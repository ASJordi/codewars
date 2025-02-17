package kyu7;

public class AntiString {

    public static String antiString(String str) {
        StringBuilder reverseNumbers = new StringBuilder("9876543210");
        StringBuilder reverseAlphabet = new StringBuilder("zyxwvutsrqponmlkjihgfedcba");
        StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        StringBuilder antiString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    String l = String.valueOf(reverseAlphabet.charAt(alphabet.indexOf(String.valueOf(c))));
                    antiString.append(l.toUpperCase());
                } else {
                    String temp = String.valueOf(c);
                    String l = String.valueOf(reverseAlphabet.charAt(alphabet.indexOf(temp.toLowerCase())));
                    antiString.append(l);
                }
            }

            if (Character.isDigit(c)) {
                antiString.append(reverseNumbers.charAt(Integer.parseInt(Character.toString(c))));
            }
        }

        return antiString.reverse().toString();
    }

}
