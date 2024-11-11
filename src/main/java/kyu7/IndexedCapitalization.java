package kyu7;

public class IndexedCapitalization {

    public static String capitalize(String s, int[] ind){
        String[] letters = s.split("");

        for (int j : ind) {
            if (j < letters.length) letters[j] = letters[j].toUpperCase();
        }

        return String.join("", letters);
    }

}
