package kyu8;

public class AlternatingCase {

    public static String toAlternativeString(String string) {

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);

            if (Character.isLowerCase(c)) {
                newString.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                newString.append(Character.toLowerCase(c));
            } else {
                newString.append(c);
            }

        }

        return newString.toString();

    }

}
