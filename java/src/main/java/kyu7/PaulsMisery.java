package kyu7;

import java.util.HashMap;

public class PaulsMisery {

    public static String paul(String[] x) {
        int value = 0;
        HashMap<String, Integer> values = new HashMap<>();
        values.put("kata", 5);
        values.put("Petes kata", 10);
        values.put("life", 0);
        values.put("eating", 1);

        for (String item : x) if (values.containsKey(item)) value += values.get(item);

        return value < 40 ? "Super happy!" :
                (value < 70 && value >= 40) ? "Happy!" :
                        (value < 100 && value >= 70) ? "Sad!" : "Miserable!";
    }

}
