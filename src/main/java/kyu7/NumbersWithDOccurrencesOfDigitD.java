package kyu7;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NumbersWithDOccurrencesOfDigitD {

    public static boolean isDD(int n) {
        String str = String.valueOf(n);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            var d = Integer.parseInt(String.valueOf(str.charAt(i)));
            map.put(d, map.getOrDefault(d, 0) + 1);
        }

        var dd = map.entrySet().stream().filter(e -> Objects.equals(e.getKey(), e.getValue())).findFirst();

        return dd.isPresent();
    }


}
