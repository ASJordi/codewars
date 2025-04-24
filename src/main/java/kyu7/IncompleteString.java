package kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IncompleteString {

    public static String testIncompleteString(String s) {
        var r = IntStream.range(0, s.length() / 2)
                .mapToObj(i -> Character.toChars((s.charAt(2 * i) + s.charAt(2 * i + 1)) / 2)[0] + "")
                .collect(Collectors.joining());

        return s.length() % 2 == 0 ? r : r + s.charAt(s.length() - 1);
    }

}
