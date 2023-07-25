package kyu7;

import java.util.ArrayList;
import java.util.Arrays;

public class LastSurvivor {

    public static String lastSurvivor(String letters, int[] coords) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(letters.split("")));
        for (int c : coords) {
            arr.remove(c);
        }
        return String.join("", arr);
    }

}
