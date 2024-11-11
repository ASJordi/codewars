package kyu7;

public class Factorial {

    public static long factorial(long n) {

        long fact = 1L;

        for (int i = 1; i <=n ; i++) fact *= i;

        return fact;
    }

}
