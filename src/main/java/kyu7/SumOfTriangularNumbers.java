package kyu7;

public class SumOfTriangularNumbers {

    public static int sumTriangularNumbers(int n) {
        return n > 0 ? n * (n + 1) * (n + 2) / 6 : 0;
    }

}
