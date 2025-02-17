package kyu8;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromList {

    public static int[] distinct(int[] array) {
        List<Integer> list = new LinkedList<>();

        for (int i : array) {
            if (!list.contains(i)) list.add(i);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
