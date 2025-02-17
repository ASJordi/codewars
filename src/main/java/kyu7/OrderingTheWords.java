package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderingTheWords {

    public String orderWord(String s) {
        if (s == null || s.isBlank()) return "Invalid String!";
        List<String> word = new ArrayList<>(Arrays.asList(s.split("")));
        Collections.sort(word);
        return String.join("", word.toArray(new String[0]));
    }

}
