package kyu7;

public class NameArrayCapping {

    public static String[] capMe(String[] strings) {
        String[] names = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String first = Character.toString(strings[i].charAt(0)).toUpperCase();
            String n = strings[i].substring(1).toLowerCase();
            names[i] = first + n;
        }

        return names;
    }

}
