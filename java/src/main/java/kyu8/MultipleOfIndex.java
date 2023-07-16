package kyu8;

import java.util.ArrayList;

public class MultipleOfIndex {

    public static void main(String[] args) {
        ArrayList<Integer> multiples = new ArrayList();
        int[] array = {0, 2, 6};

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                multiples.add(0);
                continue;
            }
            if (array[i] % i == 0) multiples.add(array[i]);
        }
    }

    public static int[] multipleOfIndex(int[] array) {

        ArrayList<Integer> multiples = new ArrayList<>();

        if (array[0] == 0) multiples.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) multiples.add(array[i]);
        }

        return multiples.stream().mapToInt(Integer::intValue).toArray();

    }

}
