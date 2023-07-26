package kyu7;

public class DoubleValueEveryNextCall {

    private static double num = 0.5;

    public static int getNumber() {
        num *= 2;
        return (int) num;
    }

}
