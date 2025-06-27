package kyu7;

import java.util.Arrays;

public class SimpleArrayProduct {

    public static int solve(int [][] arr){
        int BiggestMax = 1;
        int	BiggestMin = 1;

        for (int i = 0; i < arr.length; ++i) {
            int min = Arrays.stream(arr[i]).min().getAsInt();
            int max = Arrays.stream(arr[i]).max().getAsInt();
            int[] guess = new int[]{BiggestMax * max, BiggestMax * min, BiggestMin * max, BiggestMin * min};
            BiggestMax = Arrays.stream(guess).max().getAsInt();
            BiggestMin = Arrays.stream(guess).min().getAsInt();
        }
        return ((BiggestMax > BiggestMin) ? BiggestMax : BiggestMin);
    }

    public static int solve2(int [][] arr) {
        return findMaxProduct(arr, 0, 1);
    }

    private static int findMaxProduct(int[][] arrays, int index, int currentProduct) {
        if (index == arrays.length) return currentProduct;

        int maxProduct = Integer.MIN_VALUE;

        for (int num : arrays[index]) {
            maxProduct = Math.max(maxProduct, findMaxProduct(arrays, index + 1, currentProduct * num));
        }

        return maxProduct;
    }

}
