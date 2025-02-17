package kyu8;

public class SumOfPositive {

    public static int sum(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            if (num > 0) sum += num;
        }

        return sum;
        // return Arrays.stream(arr).filter(v -> v > 0).sum();

    }

}
