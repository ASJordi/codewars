package kyu7;

public class FactorialWithException {

    public int factorial(int n) {
        if (n < 0 || n > 12) throw new IllegalArgumentException();

        int fact = 1;

        for (int i = 1; i <=n ; i++) fact *= i;

        return fact;
    }

}
