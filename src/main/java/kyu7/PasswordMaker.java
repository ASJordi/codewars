package kyu7;

public class PasswordMaker {

    public static String makePassword(String phrase) {
        if (phrase.isBlank()) return "";
        String[] arr = phrase.split(" ");
        StringBuilder password = new StringBuilder();

        for (String a : arr) password.append(a.charAt(0));

        return password.toString()
                .replaceAll("[iI]", "1")
                .replaceAll("[oO]", "0")
                .replaceAll("[sS]", "5");
    }

}
