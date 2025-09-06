package kyu6;

import java.util.*;

public class CountTheSmileyFaces {

    public static int countSmileys(List<String> arr) {
        if (arr.isEmpty()) return 0;

        List<String> valid = Arrays.asList(":)", ":D", ";)", ";D", ":-)", ":-D", ";-)", ";-D", ":~)", ":~D", ";~)", ";~D");
        int count = 0;

        for (String s : arr) {
            if (valid.contains(s)) count++;
        }

        return count;
    }

}
