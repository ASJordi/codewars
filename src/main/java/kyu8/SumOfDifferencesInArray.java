package kyu8;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfDifferencesInArray {

    public static int sumOfDifferences(int[] arr) {

        if (arr.length <= 1) return 0;

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }

        list.sort(Collections.reverseOrder());

        for (int i = 0; i < list.size() - 1; i++) {
            sum += list.get(i) - list.get(i + 1);
        }

        return sum;
    }

}
