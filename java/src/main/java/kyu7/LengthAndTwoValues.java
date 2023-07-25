package kyu7;

import java.util.ArrayList;

public class LengthAndTwoValues {

    public static String[] alternate(int n, String firstValue, String secondValue) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) words.add(firstValue);
            else words.add(secondValue);
        }
        return words.toArray(new String[0]);
    }

}
