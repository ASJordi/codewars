package kyu7;

public class IsValidIdentifier {

    public static boolean isValid(String idn) {
        String regex = "^[a-zA-Z_$][a-zA-Z\\d_$]*$";
        return idn != null && idn.matches(regex);
    }

}
