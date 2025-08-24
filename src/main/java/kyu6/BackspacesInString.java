package kyu6;

import java.util.*;

public class BackspacesInString {

    public String cleanString(String s) {
        if (s.isBlank()) return s;

        List<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) stack.remove(stack.size() - 1);
            } else stack.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }

}
