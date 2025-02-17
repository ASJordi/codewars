package kyu7;

import java.util.LinkedList;

public class SimpleRemoveDuplicates {

    public static int[] solve(int[] arr) {
        LinkedList<Integer> uniqueNumbers = new LinkedList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!uniqueNumbers.contains(arr[i])) uniqueNumbers.addFirst(arr[i]);
        }

        return uniqueNumbers.stream().mapToInt(Integer::intValue).toArray();
    }

}
