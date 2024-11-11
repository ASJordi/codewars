package kyu7;

public class AlternateCase {

    public static String alternateCase(final String string) {
        StringBuilder res = new StringBuilder();

        for (char c : string.toCharArray()){
            if (Character.isLowerCase(c)) res.append(Character.toString(c).toUpperCase());
            else if (Character.isUpperCase(c)) res.append(Character.toString(c).toLowerCase());
            else res.append(c);
        }

        return res.toString();
    }

}
