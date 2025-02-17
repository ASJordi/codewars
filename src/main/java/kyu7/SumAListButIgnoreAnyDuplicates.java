package kyu7;

import java.util.HashSet;
import java.util.Set;

public class SumAListButIgnoreAnyDuplicates {

    public static int sumNoDuplicates(int[] arr) {
        Set<Integer> duplicates = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicates.add(arr[j]);
                }
            }
        }

        for (int num : arr) {
            if (!duplicates.contains(num)) sum += num;
        }

        return sum;
    }

}
