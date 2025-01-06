package kyu6;

import java.util.*;

public class PhoneWords {

    public static String phoneWords(String str) {
        if (str == null || str.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        List<String> list = new LinkedList<>();
        StringBuilder sequence = new StringBuilder();
        char prev = str.charAt(0);
        Map<String, String[]> map = Map.of(
                "0", new String[]{" "},
                "1", new String[]{""},
                "2", new String[]{"a", "b", "c"},
                "3", new String[]{"d", "e", "f"},
                "4", new String[]{"g", "h", "i"},
                "5", new String[]{"j", "k", "l"},
                "6", new String[]{"m", "n", "o"},
                "7", new String[]{"p", "q", "r", "s"},
                "8", new String[]{"t", "u", "v"},
                "9", new String[]{"w", "x", "y", "z"}
        );

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == prev) {
                sequence.append(c);
                if (i == str.length() - 1) list.add(sequence.toString());
            }
            else {
                list.add(sequence.toString());
                sequence = new StringBuilder();
                sequence.append(c);
                if (i == str.length() - 1) list.add(sequence.toString());
                prev = c;
            }
        }

        for (String num : list) {
            int len = num.length() - 1;
            String key = Character.toString(num.charAt(0));
            if (map.containsKey(key)) {
                String[] arr = map.get(key);
                int lenArr = arr.length;
                if (len < lenArr) sb.append(arr[len]);
                else {
                    while (len >= 0) {
                        sb.append(arr[lenArr - 1]);
                        len -= lenArr;
                    }
                }
            }
        }

        return sb.toString();
    }

}
