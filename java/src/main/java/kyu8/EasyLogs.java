package kyu8;

public class EasyLogs {

    public static double logs(double x, double a, double b) {
        double logOne = Math.log(a) / Math.log(x);
        double logTwo = Math.log(b) / Math.log(x);
        return logOne + logTwo;
    }

}
