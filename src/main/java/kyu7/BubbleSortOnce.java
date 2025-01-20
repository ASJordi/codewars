package kyu7;

public class BubbleSortOnce {

    public static int[] bubbleSortOnce(int[] array) {

        int[] sorted = array.clone();

        for (int i = 0; i < array.length - 1; i++) {
            int current = sorted[i];
            int next = sorted[i + 1];

            if (current > next) {
                sorted[i] = next;
                sorted[i + 1] = current;
            }
        }

        return sorted;
    }

}
