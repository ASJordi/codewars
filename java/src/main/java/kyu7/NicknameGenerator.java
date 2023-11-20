package kyu7;

public class NicknameGenerator {

    public static String nickname (String name) {
        if (name.length() < 4) return "Error: Name too short";
        String vowels = "aeiou";
        if (!vowels.contains(Character.toString(name.charAt(2)))) return name.substring(0, 3);
        return name.substring(0, 4);
    }

}
