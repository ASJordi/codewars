package kyu8;

public class CountByX {

    public static void main(String[] args) {
        int x = 1;
        int n = 10;
        int[] multiples = new int[n];

        for (int i = 1; i <= n; i++) {
            multiples[i] = i * x;
        }
    }

    public static int[] countBy(int x, int n){

        int[] multiples = new int[n];

        for (int i = 1; i <= n; i++) {
            multiples[i - 1] = i * x;
        }

        return multiples;
//        return IntStream.rangeClosed(1, n).map(i -> i * x).toArray();

    }

}
