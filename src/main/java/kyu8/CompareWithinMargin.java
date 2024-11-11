package kyu8;

public class CompareWithinMargin {

    public static int closeCompare(double a, double b) {
        return closeCompare(a, b, 0);
    }

    public static int closeCompare(double a, double b, double margin) {
        double distance = Math.abs(a - b);
        return margin >= distance ? 0 : a < b ? -1 : 1;
    }

}
