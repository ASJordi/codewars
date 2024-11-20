package kyu8;

public class MultiplyTheNumber {

    public static int multiply(int number) {
        int n = String.valueOf(Math.abs(number)).length();
        return (int) (number * Math.pow(5, n));
    }

}
