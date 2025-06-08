package kyu7;

public class ProductArray {

    public static long[] productArray(int[] numbers) {
        long[] product = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long prod = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    prod *= numbers[j];
                }
            }
            product[i] = prod;
        }

        return product;
    }

}
