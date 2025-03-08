package kyu7;

public class EvenNumbersInAnArray {

    public static int[] evenNumbers(int[] arr, int n){
        int[] even = new int[n];
        int j = n - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                even[j] = arr[i];
                j--;
            }
            if (j < 0) break;
        }

        return even;
    }

}
