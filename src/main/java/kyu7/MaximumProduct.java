package kyu7;

public class MaximumProduct {

    public int adjacentElementsProduct(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            int product = array[i - 1] * array[i];
            max = Math.max(max, product);
        }

        return max;
    }

}
