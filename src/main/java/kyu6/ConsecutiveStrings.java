package kyu6;

import java.util.*;

public class ConsecutiveStrings {

    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        if( n == 0 || k > n || k <= 0) return "";

        List<String> list = new LinkedList<>();

        for(int i = 0; i < strarr.length - k + 1; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < i + k; j++) {
                sb.append(strarr[j]);
            }
            list.add(sb.toString());
        }

        return list.stream().max(Comparator.comparingInt(String::length)).stream().findFirst().get();
    }

}
