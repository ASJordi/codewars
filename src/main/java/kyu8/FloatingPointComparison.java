package kyu8;


public class FloatingPointComparison {

    public static boolean approxEquals(double a, double b) {
        double epsilon = 0.001d;
        return (Math.abs(a - b) < epsilon);
    }

}
