package kyu8;

public class FindTheIntegral {

    public static String integrate(int coefficient, int exponent) {
        int e = exponent + 1;
        int integral = coefficient / e;
        return integral + "x^" + e;
    }

}
