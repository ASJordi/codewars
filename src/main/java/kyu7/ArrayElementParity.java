package kyu7;

import java.util.*;

public class ArrayElementParity {

    public static int solve(int [] arr) {
        Set<Integer> positive = new HashSet<>();
        Set<Integer> negative = new HashSet<>();

        for (int n : arr) {
            if (n > 0) positive.add(n);
            else negative.add(Math.abs(n));
        }

        if (positive.size() > negative.size()) positive.removeAll(negative);
        else negative.removeAll(positive);

        return positive.size() < negative.size() ? positive.iterator().next() : - negative.iterator().next();
    }

}
