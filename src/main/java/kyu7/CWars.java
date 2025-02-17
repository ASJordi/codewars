package kyu7;

public class CWars {

    public static String initials(String name) {
        String[] names = name.split(" ");
        StringBuilder fullName = new StringBuilder();

        for (int i = 0; i < names.length - 1; i++) {
            fullName.append(Character.toString(names[i].charAt(0)).toUpperCase()).append(".");
        }

        fullName.append(Character.toString(names[names.length - 1].charAt(0)).toUpperCase()).append(names[names.length - 1].substring(1));

        return fullName.toString();
    }

}
