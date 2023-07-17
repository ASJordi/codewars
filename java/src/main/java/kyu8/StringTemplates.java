package kyu8;

public class StringTemplates {

    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }

}
