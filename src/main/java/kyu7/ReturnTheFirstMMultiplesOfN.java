package kyu7;

public class ReturnTheFirstMMultiplesOfN {

    public static int[] multiples(int m, int n) {
        int[] mul = new int[m];

        for (int i = 0; i < m; i++) {
            mul[i] = (i + 1) * n;
        }

        return mul;
    }

}
