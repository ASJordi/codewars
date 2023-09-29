package kyu7;

import java.util.*;

public class Testing123 {

    public static List<String> number(List<String> lines) {
        if (lines.isEmpty()) return new ArrayList<>();
        ArrayList<String> format = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            format.add((i + 1) + ": " + lines.get(i));
        }

        return format;
    }

}
