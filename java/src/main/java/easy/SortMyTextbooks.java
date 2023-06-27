package easy;

import java.util.*;

public class SortMyTextbooks {

    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }

}
