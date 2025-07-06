package kyu7;

import java.util.*;

public class ShowMultiplesOf2NumbersWithinARange {

    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < s3; i++) {
            if (i % s1 == 0 && i % s2 == 0) list.add(i);
        }

        return list;
    }

}
