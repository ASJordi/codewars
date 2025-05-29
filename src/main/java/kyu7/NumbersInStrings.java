package kyu7;

import java.util.*;

public class NumbersInStrings {

    public static int solve(String s) {
        if (s == null || s.isEmpty()) return 0;

        List<Integer> list = new ArrayList<>();
        String[] arr = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        for (String str : arr) {
            if (Character.isDigit(str.charAt(0))) list.add(Integer.parseInt(str));
        }

        return list.stream().max(Integer::compareTo).get();
    }

}
