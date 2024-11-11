package kyu7;

import java.util.Arrays;

public class LargestElements {

    public static int[] largest(int n, int[] arr) {
        int[] numbers = new int[n];
        int aux = 0;
        Arrays.sort(arr);

        for (int i = (arr.length - n); i < arr.length; i++) {
            numbers[aux] = arr[i];
            aux++;
        }

        return numbers;
//        return Arrays.copyOfRange(arr,arr.length-n,arr.length);
    }

}
