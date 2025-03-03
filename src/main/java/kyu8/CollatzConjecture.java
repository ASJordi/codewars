package kyu8;

public class CollatzConjecture {

    public static int hotpo(int n) {
        int count = 0;

        while (n != 1) {
            if (n % 2 == 0) n = n / 2;
            else n = n * 3 + 1;
            count++;
        }

        return count;
    }

}
