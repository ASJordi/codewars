package kyu6;

public class BreakCamelCase {

    public static String camelCase(String input) {
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))){
                word.append(" ");
                word.append(input.charAt(i));
            } else {
                word.append(input.charAt(i));
            }
        }

        return word.toString();
    }

}
