package kyu7;

public class AlternateSquareSum {

    public static int alternateSqSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) sum += arr[i];
            else sum += (arr[i] * arr[i]);
        }

        return sum;
    }

}
