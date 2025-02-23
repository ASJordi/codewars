package kyu7;

import java.util.*;

public class ExtraPerfectNumbers {

    public static int[] extraPerfect(int number) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= number; i++) {
            var binary = Integer.toBinaryString(i);
            if (binary.charAt(0) == '1' && binary.charAt(binary.length() - 1) == '1') list.add(i);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
